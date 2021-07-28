package com.hit.srv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.validation.Valid;  

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hit.beans.VendorBean;
import com.hit.dao.VendorDao;
import com.hit.dao.VendorDaoImpl;
import com.hit.utility.DBUtil;
import com.hit.utility.IDUtil;

/**
 * Servlet implementation class RegisterSrv
 */
@WebServlet("/RegisterSrv")
public class RegisterSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String dobb = request.getParameter("dob");
		String gend = request.getParameter("gender");
		//int vmob = Integer.parseInt(mob);
		String emai = request.getParameter("email");
		String con = request.getParameter("contact");
		String cate = request.getParameter("category");
		String passw = request.getParameter("password");
		
		String vid =IDUtil.generateVendorId();
		
		VendorBean vendor = new VendorBean(fname, lname, dobb, gend, emai, con,cate,passw,vid);
		
		VendorDao dao = new VendorDaoImpl();
		
		String status = dao.registerVendor(vendor);
	
		PrintWriter pw = response.getWriter();
		
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		
		rd.include(request, response);
		
		pw.print("<script>document.getElementById('show').innerHTML = '"+status+"'</script>");
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}
