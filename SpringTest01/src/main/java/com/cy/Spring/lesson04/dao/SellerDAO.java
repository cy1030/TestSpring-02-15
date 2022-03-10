package com.cy.Spring.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.cy.Spring.lesson04.model.Seller;

@Repository
public interface SellerDAO {
	
	public int insertSeller(
			@Param("nickname") String nickName,
			@Param("profileUrl") String profileUrl,
			@Param("temperature") double temperature);

	public Seller selectLastSeller();
	
	public Seller selectSellelr(@Param("id") int id);
}