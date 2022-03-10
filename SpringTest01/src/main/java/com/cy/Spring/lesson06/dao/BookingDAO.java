package com.cy.Spring.lesson06.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cy.Spring.lesson06.model.Booking;

@Repository
public interface BookingDAO {
	
	public List<Booking> selectBookingList(); 
		
	
	
}
