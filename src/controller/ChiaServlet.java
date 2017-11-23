package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ChiaServlet", urlPatterns = {"/ChiaServlet"})
public class ChiaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numA = Integer.valueOf(request.getParameter("numA"));
        int numB = Integer.valueOf(request.getParameter("numB"));
        response.setContentType("text/html;charset=UTF-8");


        float kq = (float) numA/numB;

        request.getRequestDispatcher("pages/index.jsp").include(request, response);
        response.getWriter().println("<h2>Kết quả: " + kq + " </h2>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
