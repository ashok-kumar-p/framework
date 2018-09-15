package com.jspiders.relation.util;

import com.jspiders.relation.dao.PersonDAO;
import com.jspiders.relation.dto.PassportDTO;
import com.jspiders.relation.dto.PersonDTO;

public class Tester {

	public static void main(String[] args) {
		System.out.println("main method started");
		PersonDTO pdto = new PersonDTO();
		pdto.setName("Rajneesh");
		pdto.setAge(35);
		pdto.setPhNum(6789898989l);
		pdto.setCity("Bengaluru");

		
		PassportDTO ppdto = new PassportDTO();
		ppdto.setPpNum("IND287866");
		ppdto.setValidity("31-12-2025");
		ppdto.setNationality("Indian");
		ppdto.setBirthPlace("Delhi");
		
		pdto.setPassport(ppdto);
		ppdto.setPerson(pdto);
		
		PersonDAO dao = new PersonDAO();
		dao.create(pdto);
		
		
		
		System.out.println("main method ended");
	}
}
