package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get the data from User
		UserBean bean = new UserBean();
		// set the user data to user bean class
		bean.setuName(req.getParameter("uname"));
		bean.setpWord(req.getParameter("pwd"));
		bean.setfName(req.getParameter("fname"));
		bean.setlName(req.getParameter("lname"));
		bean.setmId(req.getParameter("mid"));
		bean.setAddress(req.getParameter("addr"));
		bean.setPhoneNo(Long.parseLong(req.getParameter("phno")));
		int k = new RegisterDao().insert(bean);
		if (k > 0) {
			req.setAttribute("msg", "User Register SuccessFully....<br>");
			req.getRequestDispatcher("Register1.jsp").forward(req, resp);
		}
	}
}
