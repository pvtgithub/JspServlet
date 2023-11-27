package bai2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SelectUser")
public class SelectUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao usD = new UserDao();
        req.setAttribute("listUser",usD.getAllUser());
        RequestDispatcher rd = req.getRequestDispatcher("view_baitap2/viewUser.jsp");
        rd.forward(req,resp);
    }
}
