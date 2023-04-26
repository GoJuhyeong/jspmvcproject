package com.playdata.util;

import javax.servlet.ServletContext;
import java.sql.Connection;

public class JdbcServletContextDBUtil implements DBUtil{
    @Override
    public Connection getConnection(ServletContext servletContext) {
        return (Connection) servletContext.getAttribute("conn");
    }
}
