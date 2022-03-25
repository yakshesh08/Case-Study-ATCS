package com.cs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobiledb")
public class Mobile {
	
	@Id
	@Column(name="mid",length=10)
	private int mobId;
	
	@Column(name="mname",length=20)
	private String mobName;
	
	@Column(name="mtype",length=10)
	private String mobType;
	
	@Column(name="mprice",length=10)
	private int mobPrice;
	
	@Column(name="mwarenty",length=5)
	private int mobWarenty;
	
	@Column(name="mimein",length=10)
	private int mobileIMEINumber;

	public int getMobId() {
		return mobId;
	}

	public void setMobId(int mobId) {
		this.mobId = mobId;
	}

	public String getMobName() {
		return mobName;
	}

	public void setMobName(String mobName) {
		this.mobName = mobName;
	}

	public String getMobType() {
		return mobType;
	}

	public void setMobType(String mobType) {
		this.mobType = mobType;
	}

	public int getMobPrice() {
		return mobPrice;
	}

	public void setMobPrice(int mobPrice) {
		this.mobPrice = mobPrice;
	}

	public int getMobWarenty() {
		return mobWarenty;
	}

	public void setMobWarenty(int mobWarenty) {
		this.mobWarenty = mobWarenty;
	}

	public int getMobileIMEINumber() {
		return mobileIMEINumber;
	}

	public void setMobileIMEINumber(int mobileIMEINumber) {
		this.mobileIMEINumber = mobileIMEINumber;
	}

	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	public Mobile(int mobId, String mobName, String mobType, int mobPrice, int mobWarenty, int mobileIMEINumber) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
		this.mobType = mobType;
		this.mobPrice = mobPrice;
		this.mobWarenty = mobWarenty;
		this.mobileIMEINumber = mobileIMEINumber;
	}

	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", mobName=" + mobName + ", mobType=" + mobType + ", mobPrice=" + mobPrice
				+ ", mobWarenty=" + mobWarenty + ", mobileIMEINumber=" + mobileIMEINumber + "]";
	}
	

}
