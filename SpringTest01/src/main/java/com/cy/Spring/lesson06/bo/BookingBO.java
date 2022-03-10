package com.cy.Spring.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.Spring.lesson06.dao.BookingDAO;
import com.cy.Spring.lesson06.model.Booking;

@Service
public class BookingBO {
	
	@Autowired
	private BookingDAO bookingDAO;
	
	public List<Booking> getBookingList(){
		
		return bookingDAO.selectBookingList();
	}
}
