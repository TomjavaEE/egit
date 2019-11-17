package com.T8073.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.T8073.entity.Attence;
import com.T8073.service.AttenceService;
import com.T8073.service.AttenceServiceImpl;

/**
 * Servlet implementation class addServlet
 */
@WebServlet("/addServlet")
public class addServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		AttenceService attence=new AttenceServiceImpl();
		String empName=request.getParameter("empName");
		String dept=request.getParameter("dept");
		Date chkDate=Date.valueOf(request.getParameter("chkDate"));
		String status=request.getParameter("status");
//		System.out.println(empName);
//		System.out.println(dept);
//		System.out.println(chkDate);
//		System.out.println(status);
		Attence atten=new Attence();
		atten.setEmpName(empName);
		atten.setDept(dept);
		atten.setChkDate(chkDate);
		atten.setStatus(status);
		attence.InsertAttence(atten);
		request.getRequestDispatcher("ok.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
