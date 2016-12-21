package com.imp.TestSite3.dao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet("/testdb")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String user = "spring2student";
        String pass = "spring2student";

        String jdbcUrl = "jdbc:mysql://localhost:3306/training_center?useSSL=false";
        String driver = "com.mysql.jdbc.Driver";

        try {
            PrintWriter out = response.getWriter();

            out.println("Connecting to DB "+jdbcUrl);

            Class.forName(driver);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

            out.println("GOOD");

            myConn.close();



        }catch (Exception exc){
            exc.printStackTrace();
            throw new ServletException(exc);
        }


    }

}
