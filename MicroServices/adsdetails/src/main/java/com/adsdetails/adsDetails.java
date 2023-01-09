package com.adsdetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Ads details")
public class adsDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ADS-ID")
	private long AdsId;
	@Column(name="ADS-NAME")
	private String AdsName;
	@Column(name="ADS-LOCATION")
	private String AdsLocation;
	@Column(name="ADS-PRICE")
	private String AdsPlan;
	@Column(name="ADS-TYPE")
	private String AdsType;
	@Column(name="ADS-DETAILS")
	private String AdsDetails;
	@Column(name="ADS-IMAGES")
	private String AdsImages;
	@Column(name="USER-EMAIL")
	private String UserEmail;
	@Column(name="USER-PHONE")
	private String UserPhonenumber;
	@Column(name="USER-ID")
	private String UserId;
	public adsDetails(long adsId, String adsName, String adsLocation, String adsPlan, String adsType, String adsDetails,
			String adsImages, String userEmail, String userPhonenumber, String userId) {
		super();
		AdsId = adsId;
		AdsName = adsName;
		AdsLocation = adsLocation;
		AdsPlan = adsPlan;
		AdsType = adsType;
		AdsDetails = adsDetails;
		AdsImages = adsImages;
		UserEmail = userEmail;
		UserPhonenumber = userPhonenumber;
		UserId = userId;
	}
	public long getAdsId() {
		return AdsId;
	}
	public void setAdsId(long adsId) {
		AdsId = adsId;
	}
	public String getAdsName() {
		return AdsName;
	}
	public void setAdsName(String adsName) {
		AdsName = adsName;
	}
	public String getAdsLocation() {
		return AdsLocation;
	}
	public void setAdsLocation(String adsLocation) {
		AdsLocation = adsLocation;
	}
	public String getAdsPlan() {
		return AdsPlan;
	}
	public void setAdsPlan(String adsPlan) {
		AdsPlan = adsPlan;
	}
	public String getAdsType() {
		return AdsType;
	}
	public void setAdsType(String adsType) {
		AdsType = adsType;
	}
	public String getAdsDetails() {
		return AdsDetails;
	}
	public void setAdsDetails(String adsDetails) {
		AdsDetails = adsDetails;
	}
	public String getAdsImages() {
		return AdsImages;
	}
	public void setAdsImages(String adsImages) {
		AdsImages = adsImages;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getUserPhonenumber() {
		return UserPhonenumber;
	}
	public void setUserPhonenumber(String userPhonenumber) {
		UserPhonenumber = userPhonenumber;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public adsDetails() {
		super();
	}
	@Override
	public String toString() {
		return "adsDetails [AdsId=" + AdsId + ", AdsName=" + AdsName + ", AdsLocation=" + AdsLocation + ", AdsPlan="
				+ AdsPlan + ", AdsType=" + AdsType + ", AdsDetails=" + AdsDetails + ", AdsImages=" + AdsImages
				+ ", UserEmail=" + UserEmail + ", UserPhonenumber=" + UserPhonenumber + ", UserId=" + UserId + "]";
	}

	
}
