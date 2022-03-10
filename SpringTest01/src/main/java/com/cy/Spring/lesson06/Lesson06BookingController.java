package com.cy.Spring.lesson06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cy.Spring.lesson06.bo.BookingBO;
import com.cy.Spring.lesson06.model.Booking;

@Controller
@RequestMapping("/lesson06")
public class Lesson06BookingController {
	
	@Autowired
	private BookingBO bookingBO;
	
	@GetMapping("/booking_list")
	public String BookingList(Model model) {
		
		List<Booking> bookingList =  bookingBO.getBookingList();
		
		model.addAttribute("bookingList", bookingList);
		
		return "lesson06/bookingList";
	}
	
	@GetMapping("/booking_insert")
	public String insertBooking() {
		
		return "lesson06/insertBooking";
	}
	
	
	
}
