package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CalculateServlet", urlPatterns = {"/CalculateServlet"} )
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int numA = Integer.valueOf(request.getParameter("numA"));
//        int numB = Integer.valueOf(request.getParameter("numB"));
//
//        request.getRequestDispatcher("pages/index.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("pages/index.jsp").forward(request, response);
    }
}
