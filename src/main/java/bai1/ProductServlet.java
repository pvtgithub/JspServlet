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

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Sữa duclady", "https://p-vn.ipricegroup.com/bc9a99afa34cd518237963c50c4c94bd626346fe_0.jpg?position=1",200000));
        productList.add(new Product(2,"Sữa Vinamik", "https://p-vn.ipricegroup.com/bc9a99afa34cd518237963c50c4c94bd626346fe_0.jpg?position=2",512000));
        productList.add(new Product(3,"Sữa Fami", "https://p-vn.ipricegroup.com/bc9a99afa34cd518237963c50c4c94bd626346fe_0.jpg?position=3",120000));
        productList.add(new Product(4,"Sữa Cô gái Hà Lan", "https://p-vn.ipricegroup.com/bc9a99afa34cd518237963c50c4c94bd626346fe_0.jpg?position=4",360000));

        List<Product> listProductSession = new ArrayList<>();
        HttpSession session = req.getSession();
        listProductSession = (List<Product>) session.getAttribute("listProduct");

        req.setAttribute("listSession", listProductSession);

        req.setAttribute("products", productList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("view_bai1/views.jsp");
        dispatcher.forward(req,resp);

    }

}
