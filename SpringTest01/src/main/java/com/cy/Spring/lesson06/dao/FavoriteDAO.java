package com.cy.Spring.lesson06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.cy.Spring.lesson06.model.Favorite;

@Repository
public interface FavoriteDAO {
	
	public List<Favorite> selectFavoriteList();
	
	public int insertFavorite(
			@Param("name") String name,
			@Param("url") String url
			);
	
	public int selectUrlCount(@Param("url") String url);
	
	public int deletFavorite(@Param("id") int id);
}
