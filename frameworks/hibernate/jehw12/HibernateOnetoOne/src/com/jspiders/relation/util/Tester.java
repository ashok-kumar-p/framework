package com.jspiders.relation.util;

import java.util.ArrayList;
import java.util.List;

import com.jspiders.relation.dao.AirplaneDAO;
import com.jspiders.relation.dao.EngineDAO;
import com.jspiders.relation.dao.PersonDAO;
import com.jspiders.relation.dto.AirplaneDTO;
import com.jspiders.relation.dto.EngineDTO;
import com.jspiders.relation.dto.PassportDTO;
import com.jspiders.relation.dto.PersonDTO;

public class Tester {

	public static void main(String[] args) {
		System.out.println("main method started");
		/*PersonDTO pdto = new PersonDTO();
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
		*/
		
		/*AirplaneDTO kf1 = new AirplaneDTO();
		kf1.setAirlineName("Kingfisher");
		kf1.setFlightNo("KF1234");
		kf1.setNoOfSeats(440);
		kf1.setSource("Bangalore");
		kf1.setDestination("Delhi");
		
		EngineDTO e1 = new EngineDTO();
		e1.setEngNo("ENG000000456");
		e1.setMakeDate("2010");
		e1.setCapacity(30000);
		e1.setManufacturerName("RollsRoyce");
		
		EngineDTO e2 = new EngineDTO();
		e2.setEngNo("ENG000000123");
		e2.setMakeDate("2015");
		e2.setCapacity(29000);
		e2.setManufacturerName("General Electric");
		
		List<EngineDTO>	engineList = new ArrayList<>();
		engineList.add(e1);
		engineList.add(e2);
		
		kf1.setEngineList(engineList);
		
		AirplaneDAO dao = new AirplaneDAO();
		dao.createFlight(kf1);*/
		
		EngineDTO e3 = new EngineDTO();
		e3.setEngNo("ENG000000789");
		e3.setCapacity(300000);
		e3.setMakeDate("2012");
		e3.setManufacturerName("General Electric");
		
		AirplaneDTO a1 = new AirplaneDTO();
		a1.setId(1);
		
		e3.setAirplane(a1);
		
		EngineDAO edao = new EngineDAO();
		edao.createEngine(e3);
		
		System.out.println("main method ended");
	}
}
