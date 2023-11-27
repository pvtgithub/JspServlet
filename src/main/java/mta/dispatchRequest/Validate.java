/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mta.dispatchRequest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author DELL E7450
 */
@WebServlet(name = "Validate", urlPatterns = {"/Validate"})

public class Validate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String name = request.getParameter("user");
            String password = request.getParameter("pass");
            if (password.equals("admin")) {
                //forward --
                RequestDispatcher rd = request.getRequestDispatcher("Welcome");
                rd.forward(request, response);
            } else {
                out.println("<font color='red'><b>You have entered incorrect password</b></font>");
        RequestDispatcher rd = request.getRequestDispatcher("Index_dispatchRequest.html");
                rd.include(request, response);
            }
        } finally {
            out.close();
        }
    }
}
 
