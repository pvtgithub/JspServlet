package bai2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int res = 0;
        res = Integer.parseInt(req.getParameter("id"));

        UserDao ud = new UserDao();
        User us = ud.getOneUser(res);
        req.setAttribute("user", us);
        RequestDispatcher rd = req.getRequestDispatcher("view_baitap2/updateUser.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao ud = new UserDao();
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String sex = req.getParameter("sex");
        String country = req.getParameter("country");
        User user = new User(name, password, email, sex, country);
        int res = ud.update(id,user);
        if (res == 0) {
            System.out.println("cap nhat khong thanh cong");
        } else {
            resp.sendRedirect("SelectUser");
        }
    }
}
