package com.playdata.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebListener
public class DbConnectionListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        String dbUrl = sce.getServletContext().getInitParameter("DB_URL");
        String dbUser = sce.getServletContext().getInitParameter("DB_USER");
        String dbPassword = sce.getServletContext().getInitParameter("DB_PASWWORD");

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            sce.getServletContext().setAttribute("conn", conn);
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //ServletContext가 종료 (WAS: Tomcat 종료)될 때 Connection 객체를 close --> 메모리 누수를 방지
        Connection conn = (Connection) sce.getServletContext().getAttribute("conn");
        try{
            conn.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
