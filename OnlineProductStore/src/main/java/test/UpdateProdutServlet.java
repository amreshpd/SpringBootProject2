package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProdutServlet extends HttpServlet{
  @SuppressWarnings("unchecked")
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      HttpSession hs = req.getSession(false);
      if(hs==null) {
    	  req.setAttribute("msg","Session Expired...<br>");
    	  req.getRequestDispatcher("Msg.jsp").forward(req, resp);
      }else {
    	ArrayList<ProductBean> al=(ArrayList<ProductBean>)hs.getAttribute("alist");
    	String pcode=req.getParameter("pcode");
    	double price=Double.parseDouble(req.getParameter("price"));
    	int qty=Integer.parseInt(req.getParameter("qty"));
    	Iterator<ProductBean> it = al.iterator();
    	while(it.hasNext()) {
    		ProductBean pb=(ProductBean)it.next();
    		if(pcode.equals(pb.getCode())) {
    			pb.setPrice(price);
    			pb.setQuantity(qty);
    			int k=new UpdateProductDao().update(pb);
    			if(k>0) {
    				req.setAttribute("msg", "Product Updated successfully...<br>");
    				req.getRequestDispatcher("UpdateProduct.jsp").forward(req, resp);
    			}
    		}
    	}
      }
      
      
}
}
