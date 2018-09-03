package com.jspiders.dp.dao;

import com.jspiders.dp.dto.StudentDTO;

public class StudentDAO {

	public StudentDAO() {
		System.out.println("StudentDAO object created");
	}
	
	public void create(StudentDTO dto){
		System.out.println("Inside create method");
		//Here we can write DB logic
	}
}
