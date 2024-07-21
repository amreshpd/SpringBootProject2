package test;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uName = req.getParameter("uname");
		String pwd = req.getParameter("pwd");
		UserBean ub = new LoginDao().login(uName, pwd);
		if (ub == null) {
			req.setAttribute("msg", "invalid User Name");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		} else {
			ServletContext sct = req.getServletContext();
			sct.setAttribute("ubean", ub);
			Cookie ck = new Cookie("fName", ub.getfName());
			resp.addCookie(ck);
			req.getRequestDispatcher("Login.jsp").forward(req, resp);

		}
	}
}
