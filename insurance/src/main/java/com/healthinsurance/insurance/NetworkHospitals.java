package com.healthinsurance.insurance;

import java.sql.Date;

public class NetworkHospitals {
	
	int hosp_id,hosp_pincode,hosp_luuser;
	long hosp_mobile,hosp_phone;
	String hosp_title,hosp_location,hosp_address;
	Date hosp_luudate;
	
	
	public NetworkHospitals() {
		super();
	}
	
	
	public int getHosp_id() {
		return hosp_id;
	}
	
	public void setHosp_id(int hosp_id) {
		this.hosp_id = hosp_id;
	}
	
	public int getHosp_pincode() {
		return hosp_pincode;
	}
	
	public void setHosp_pincode(int hosp_pincode) {
		this.hosp_pincode = hosp_pincode;
	}
	
	public int getHosp_luuser() {
		return hosp_luuser;
	}
	
	public void setHosp_luuser(int hosp_luuser) {
		this.hosp_luuser = hosp_luuser;
	}
	
	public long getHosp_mobile() {
		return hosp_mobile;
	}
	
	public void setHosp_mobile(long hosp_mobile) {
		this.hosp_mobile = hosp_mobile;
	}
	
	public long getHosp_phone() {
		return hosp_phone;
	}
	
	public void setHosp_phone(long hosp_phone) {
		this.hosp_phone = hosp_phone;
	}
	
	public String getHosp_title() {
		return hosp_title;
	}
	
	public void setHosp_title(String hosp_title) {
		this.hosp_title = hosp_title;
	}
	
	public String getHosp_location() {
		return hosp_location;
	}
	
	public void setHosp_location(String hosp_location) {
		this.hosp_location = hosp_location;
	}
	
	public String getHosp_address() {
		return hosp_address;
	}
	
	public void setHosp_address(String hosp_address) {
		this.hosp_address = hosp_address;
	}
	
	public Date getHosp_luudate() {
		return hosp_luudate;
	}
	
	public void setHosp_luudate(Date hosp_luudate) {
		this.hosp_luudate = hosp_luudate;
	}

}


