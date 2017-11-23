package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SecondServlet", urlPatterns = {"/SecondServlet"})
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numA = Integer.valueOf(request.getParameter("numA"));
        int numB = Integer.valueOf(request.getParameter("numB"));

        response.setContentType("text/html;charset=UTF-8");

        request.setAttribute("numA", numA);
        request.setAttribute("numB", numB);

        String option = request.getParameter("sl_opt");
        request.setAttribute("temp", option);
        float kq = 0;

        switch (option)
        {
            case "Addition":
                kq = numA + numB;
                break;
            case "Subtraction":
                kq = numA - numB;
                break;

            case "Multiple":
                kq = numA * numB;
                break;

            case "Divide":
                kq = numA / numB;
                break;

            default:
        }
        request.getRequestDispatcher("pages/index2.jsp").include(request, response);


        response.getWriter().println("<h2>Kết quả: " + kq + " </h2>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("pages/index2.jsp").forward(request, response);
    }
}
