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

@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // Lưu dữ liệu vào session
        HttpSession session = req.getSession();
        List<Product> listProduct = (List<Product>) session.getAttribute("listProduct");
        if (listProduct == null) {
            listProduct = new ArrayList<>();
            session.setAttribute("listProduct", listProduct);
        }

        // Lấy dữ liệu từ form submit
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String image = req.getParameter("image");
        double price = Double.parseDouble(req.getParameter("price"));
        Product newP = new Product(id, name, image, price);

        listProduct.add(newP);
        req.setAttribute("listProduct", listProduct);
        RequestDispatcher rq = req.getRequestDispatcher("ProductServlet");
        rq.forward(req, resp);
    }
}
