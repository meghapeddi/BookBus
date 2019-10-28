package com.lti.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.PassengerDTO;

@Controller
@SessionAttributes({"noOfSeats","passengerList","count"})
public class PassengerController {

	int count=1;
	List<PassengerDTO> passengerList=new ArrayList<PassengerDTO>();
	@RequestMapping(path = "/passengers.lti", method=RequestMethod.POST)
	public String fetchPassenger(HttpServletRequest request, PassengerDTO data, Map model) throws Exception {
		int noOfSeats = (Integer)request.getSession().getAttribute("noOfSeats");
		System.out.println(noOfSeats);
		//count=(Integer)request.getSession().getAttribute("count");
		System.out.println("count"+count);
		PassengerDTO passenger = new PassengerDTO();
		passenger.setPassengerName(data.getPassengerName());
		passenger.setAge(data.getAge());
		passenger.setSeatNo(data.getSeatNo());
		passenger.setGender(data.getGender());
		//int noOfSeats = Integer.parseInt(seats);
		if(count<noOfSeats) {
			//passengerList=(List<PassengerDTO>)model.get("passengerList");
			passengerList.add(passenger);
			count++;
			model.put("count", count);
//			for(PassengerDTO list:passengerList)
//			{
//				System.out.println(list.getPassengerName());
//			}
			return "passengers.jsp";
			
		}else {
			count=1;
			model.put("passengerList", passengerList);
			model.put("count", count);
			return "payment.jsp";
		}
	}
}
