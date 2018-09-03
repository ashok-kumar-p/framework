package com.jspiders.dp.util;

import com.jspiders.dp.dao.StudentDAO;
import com.jspiders.dp.dto.StudentDTO;

public class Tester {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		StudentDTO st = new StudentDTO();
		st.setId(1);
		st.setName("Rajesh");
		st.setAge(25);
		st.setPhNum(9898989898l);
		
		//Accessing DTO member
		System.out.println("StudentName:"+st.getName());
		System.out.println("StudentPhone Number:"+st.getPhNum());
		System.out.println();

		//or we can access Student reference variable st
		System.out.println("Student Details are\n"+st);
		
		//Accessing DAO object and its method
		StudentDAO dao = new StudentDAO();
		dao.create(st);
		
		System.out.println("main method ended");
	}
}
