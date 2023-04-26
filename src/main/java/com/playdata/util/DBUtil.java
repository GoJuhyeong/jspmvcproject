package com.playdata.util;

import javax.servlet.ServletContext;
import java.sql.Connection;

public interface DBUtil {
   Connection getConnection(ServletContext servletContext);
}
