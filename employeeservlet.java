package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("empName");
        String phone = request.getParameter("phone");

        out.println("<html><body>");
        out.println("<h2>Employee Details</h2>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Phone:</b> " + phone + "</p>");
        out.println("</body></html>");
    }
}
