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

@WebServlet("/DeleteProduct")
public class DeleteProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        int id = Integer.parseInt(req.getParameter("id"));
        Product productToRemove = null;

        List<Product> listProductSession = new ArrayList<>();
        listProductSession = (List<Product>) session.getAttribute("listProduct");

        for (Product pr : listProductSession){
            if(pr.getId() == id){
                productToRemove = pr;
                break;
            }
        }

        if (productToRemove != null) {
            listProductSession.remove(productToRemove);
        }

        req.setAttribute("sessionProduct", listProductSession);
        RequestDispatcher rd = req.getRequestDispatcher("view_baitap3/checkout.jsp");
        rd.forward(req,resp);

    }
}
