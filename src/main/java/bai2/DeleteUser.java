package bai2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteUser")
public class DeleteUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao ud = new UserDao();
        int res = ud.delete(Integer.parseInt(req.getParameter("id")));
        if(res == 0)
            System.out.println("Xoa khong thanh cong!");
        else{
            resp.sendRedirect("SelectUser");
        }
    }
}
