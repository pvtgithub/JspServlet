package bai1;

import bai1.model.Product;

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

@WebServlet("/CheckoutSevrlet")
public class CheckoutSevrlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        List<Product> listProductSession = new ArrayList<>();
        HttpSession session = req.getSession();
        listProductSession = (List<Product>) session.getAttribute("listProduct");

        req.setAttribute("listSession", listProductSession);

        RequestDispatcher dispatcher = req.getRequestDispatcher("view_bai1/checkout.jsp");
        dispatcher.forward(req, resp);
    }
}
