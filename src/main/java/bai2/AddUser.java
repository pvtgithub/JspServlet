package bai2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("view_baitap2/addUser.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String sex = req.getParameter("sex");
        String country = req.getParameter("country");
        User us = new User(name, password, email, sex, country);
        UserDao ud = new UserDao();
        int res = ud.save(us);
        if (res == 0)
            System.out.println("Them khong thanh cong!!!");
        else {
            resp.sendRedirect("SelectUser");
        }
    }
}
