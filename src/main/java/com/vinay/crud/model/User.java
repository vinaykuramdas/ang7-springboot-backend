package com.vinay.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	private String iStatus;
	private int tvid;
	private String tvStatus;
	private int voiceid;
	private String vStatus;
	private int internetid;
	private String name;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getiStatus() {
		return iStatus;
	}
	public void setiStatus(String iStatus) {
		this.iStatus = iStatus;
	}
	public int getTvid() {
		return tvid;
	}
	public void setTvid(int tvid) {
		this.tvid = tvid;
	}
	public String getTvStatus() {
		return tvStatus;
	}
	public void setTvStatus(String tvStatus) {
		this.tvStatus = tvStatus;
	}
	public int getVoiceid() {
		return voiceid;
	}
	public void setVoiceid(int voiceid) {
		this.voiceid = voiceid;
	}
	public String getvStatus() {
		return vStatus;
	}
	public void setvStatus(String vStatus) {
		this.vStatus = vStatus;
	}
	public int getInternetid() {
		return internetid;
	}
	public void setInternetid(int internetid) {
		this.internetid = internetid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
