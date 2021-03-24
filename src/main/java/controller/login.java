package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nikita
 */
@WebServlet(name = "login", urlPatterns = {"/login"}, loadOnStartup = 1) 
public class login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String _username = request.getParameter("username");
            String _password = request.getParameter("password");
            if (_username != null && _password != null && !_username.isEmpty() && !_password.isEmpty()) {
                if (_username.equals("Admin") && _password.equals("12345")) {
                    response.sendRedirect("welcome.jsp");

                } else {
                    out.println("Invalid username or password" + _username + " " + _password);
                }
            } else {

                out.println("Empty username or password ");

            }

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
