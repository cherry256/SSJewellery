package com.ssjewellery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GS_PRICE",schema="jewelbill1")
public class GoldAndSilverPrice {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="GS_ID")
	private long id;

	@Column(name="GOLD_PRICE",nullable=false)
	private long goldPrice;
	
	@Column(name="SILVER_PRICE",nullable=false)
	private long silverPrice;
	
	@Column(name="DATE",nullable=false)
	private String date;
	
	@Column(name="KAROT",nullable=false)
	private int karot;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public long getGoldPrice() {
		return goldPrice;
	}

	public void setGoldPrice(long goldPrice) {
		this.goldPrice = goldPrice;
	}

	public long getSilverPrice() {
		return silverPrice;
	}

	public void setSilverPrice(long silverPrice) {
		this.silverPrice = silverPrice;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getKarot() {
		return karot;
	}

	public void setKarot(int karot) {
		this.karot = karot;
	}
	
	
	
}
