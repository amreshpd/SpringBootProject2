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
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c[] = req.getCookies();
		if (c == null) {
			req.setAttribute("msg", "Session Expired.....<br>");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		} else {
			String fname = c[0].getValue();
			req.setAttribute("fname", fname);
			ServletContext sct = req.getServletContext();
			UserBean ub = (UserBean)sct.getAttribute("ubean");
			ub.setAddress(req.getParameter("addr"));
			ub.setmId(req.getParameter("mid"));
			ub.setPhoneNo(Long.parseLong(req.getParameter("phno")));
			int k=new UpdateProfileDao().update(ub);
			if(k>0) {
				req.setAttribute("msg", "profile updates successfully....<br>");
				req.getRequestDispatcher("UpdateProfile.jsp").forward(req, resp);			
			}
		}
	}
}