package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/product")
public class AddProductservlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs = req.getSession(false);   //accessing existing Session
		if(hs==null) {
			req.setAttribute("msg", "session expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, resp);
		}else {
			ProductBean pb=new ProductBean();
		   	pb.setCode(req.getParameter("code"));
		   	pb.setName(req.getParameter("name"));
		   	pb.setPrice(Double.parseDouble(req.getParameter("price")));
		   	pb.setQuantity(Integer.parseInt(req.getParameter("qty")));
		   	int k = new ProductDao().insert(pb);
		   	if(k>0) {
		   	req.setAttribute("msg", "Product added SuccessFully.....<br>");
		   	req.getRequestDispatcher("AddProduct.jsp").forward(req, resp);
		   	}	   	
		}
	}
}
