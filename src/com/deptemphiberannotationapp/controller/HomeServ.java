package com.deptemphiberannotationapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deptemphiberannotationapp.dao.DeptEmpDao;
import com.deptemphiberannotationapp.dao.DeptEmpDaoImpl;
import com.deptemphiberannotationapp.model.Department;
import com.deptemphiberannotationapp.model.Employee;
import com.deptemphiberannotationapp.service.DeptEmpServImpl;
import com.deptemphiberannotationapp.service.DeptEmpService;

/**
 * Servlet implementation class HomeServ
 */
@WebServlet("/homeserv")
public class HomeServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DeptEmpService dede = new DeptEmpServImpl();
		List<Department> ldeptj = dede.readAllDeptServ();
		//List<Employee> lemps = dede.readAllEmp();
		//request.setAttribute("empall", lemps);
		request.setAttribute("deptlv", ldeptj);
		request.setAttribute("hoser", "hseval");
		RequestDispatcher rd = request.getRequestDispatcher("home3.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
