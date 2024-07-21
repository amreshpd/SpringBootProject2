package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	Cookie []c=req.getCookies();
    	if(c==null) {
    		req.setAttribute("msg","Session Expired....<br>");
    	}else {
    		c[0].setMaxAge(0);
    		resp.addCookie(c[0]);
    		req.setAttribute("msg","Logout Successfully....<br>");
    	}
    	req.getRequestDispatcher("msg.jsp").forward(req, resp);
    }
}
