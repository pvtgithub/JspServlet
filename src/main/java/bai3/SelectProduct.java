package bai3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/SelectProduct")
public class SelectProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductDao pd = new ProductDao();
        List<Product> listProduct= pd.getAllProduct();
        req.setAttribute("listProduct", listProduct);

        RequestDispatcher rd = req.getRequestDispatcher("view_baitap3/viewProduct.jsp");
        rd.forward(req,resp);
    }
}
