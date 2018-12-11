package com.cg.donor.bean;

import java.util.Date;

public class DonorBean {
      private String doorId;
      private String doorName;
      private String phoneNumber;
      private String address;
      private float donatioAmount;
      private Date donationDate;
	public String getDoorId() {
		return doorId;
	}
	public void setDoorId(String doorId) {
		this.doorId = doorId;
	}
	public String getDoorName() {
		return doorName;
	}
	public void setDoorName(String doorName) {
		this.doorName = doorName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getDonatioAmount() {
		return donatioAmount;
	}
	public void setDonatioAmount(float f) {
		this.donatioAmount = f;
	}
	public Date getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}
	@Override
	public String toString() {
		return "DonorBean [doorId=" + doorId + ", doorName=" + doorName
				+ ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", donatioAmount=" + donatioAmount + ", donationDate="
				+ donationDate + "]";
	}
      
}
