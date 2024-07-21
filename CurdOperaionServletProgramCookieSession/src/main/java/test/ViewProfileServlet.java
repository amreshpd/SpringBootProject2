package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c[]=req.getCookies();
		if(c==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}else {
			String fname=c[0].getValue();
			req.setAttribute("fname", fname);
			req.getRequestDispatcher("ViewProfile.jsp").forward(req, resp);
		}
		
	}
}
