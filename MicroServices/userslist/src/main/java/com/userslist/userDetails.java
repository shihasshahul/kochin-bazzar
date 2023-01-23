package com.userslist;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User list")

public class userDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="ID")
	private long UserId;
	@Column(name="NAME")
	private String UserName;
	@Column(name="LASTNAME")
	private String UserLastname;
	@Column(name="EMAIL")
	private String UserEmail;
	@Column(name="PASSWORD")
	private String UserPassword;
	@Column(name="PHONE-NUMBER")
	private String UserPhonenumber;
	@Column(name="LOCATION")
	private String UserLocation;
	@Column(name="TYPE")
	private String UserType;
	
	
	public userDetails() {
		super();
	}
	public userDetails(long userId, String userName, String userLastname, String userEmail, String userPassword,
			String userPhonenumber, String userLocation, String userType) {
		super();
		
		UserName = userName;
		UserLastname = userLastname;
		UserEmail = userEmail;
		UserPassword = userPassword;
		UserPhonenumber = userPhonenumber;
		UserLocation = userLocation;
		UserType = userType;
	}
	
	public long getUserId() {
		return UserId;
	}
	public void setUserId(long userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserLastname() {
		return UserLastname;
	}
	public void setUserLastname(String userLastname) {
		UserLastname = userLastname;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public String getUserPhonenumber() {
		return UserPhonenumber;
	}
	public void setUserPhonenumber(String userPhonenumber) {
		UserPhonenumber = userPhonenumber;
	}
	public String getUserLocation() {
		return UserLocation;
	}
	public void setUserLocation(String userLocation) {
		UserLocation = userLocation;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	@Override
	public String toString() {
		return "userDetails [UserId=" + UserId + ", UserName=" + UserName + ", UserLastname=" + UserLastname
				+ ", UserEmail=" + UserEmail + ", UserPassword=" + UserPassword + ", UserPhonenumber=" + UserPhonenumber
				+ ", UserLocation=" + UserLocation + ", UserType=" + UserType + "]";
	}
	
	
	
	
	}

	
	
	
	

	

	

