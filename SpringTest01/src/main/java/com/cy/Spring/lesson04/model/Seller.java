package com.cy.Spring.lesson04.model;

import java.util.Date;

public class Seller {
	
	private int id;
	private String nickname;
	private String profilImage;
	private int temperatuer;
	private Date createdAT;
	private Date updatedAT;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getProfilImage() {
		return profilImage;
	}
	public void setProfilImage(String profilImage) {
		this.profilImage = profilImage;
	}
	public int getTemperatuer() {
		return temperatuer;
	}
	public void setTemperatuer(int temperatuer) {
		this.temperatuer = temperatuer;
	}
	public Date getCreatedAT() {
		return createdAT;
	}
	public void setCreatedAT(Date createdAT) {
		this.createdAT = createdAT;
	}
	public Date getUpdatedAT() {
		return updatedAT;
	}
	public void setUpdatedAT(Date updatedAT) {
		this.updatedAT = updatedAT;
	}
	
}
