package com.jspiders.crud.util;

import com.jspiders.crud.dao.EmployeeDAO;
import com.jspiders.crud.dto.EmployeeDTO;

public class EmployeeTester {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		/*EmployeeDTO e1 = new EmployeeDTO();
		//e1.setId(1);
		e1.setEmpName("Rakesh");
		e1.setEmpEmail("raki@gmail.com");
		e1.setEmpId("ABC030");
		e1.setSalary(45000.00);*/
		
		EmployeeDAO dao = new EmployeeDAO();
		//dao.createEmp(e1);
		//dao.getEmp(100);
		dao.update("Rajneesh", 4);
		dao.delete(2);
		
		System.out.println("main method ended");
	}
}
