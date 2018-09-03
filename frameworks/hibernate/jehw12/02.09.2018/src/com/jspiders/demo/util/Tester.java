package com.jspiders.demo.util;

import com.jspiders.demo.dao.StudentDAO;
import com.jspiders.demo.dto.StudentDTO;

public class Tester {

	public static void main(String[] args) {
		System.out.println("main method started");

		StudentDTO st = new StudentDTO();
		st.setId(1);
		st.setName("Rajesh");
		st.setAge(25);
		st.setPhNum(9898989898l);

		StudentDAO dao = new StudentDAO();
		dao.create(st);

		System.out.println("main method ended");
	}
}
