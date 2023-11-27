package bai3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/CheckOutProduct")
public class CheckOutProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> listProductSession = new ArrayList<>();
        HttpSession session = req.getSession();
        listProductSession = (List<Product>) session.getAttribute("listProduct");

        req.setAttribute("sessionProduct", listProductSession);
        RequestDispatcher rd = req.getRequestDispatcher("view_baitap3/checkout.jsp");
        rd.forward(req,resp);
    }
}
