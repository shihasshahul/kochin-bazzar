package com.postdetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Post Details")


public class postDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="post id")
	private long PostId;
	@Column(name="POST-NAME")
	private String PostName;
	@Column(name="POST-LOCATION")
	private String PostLocation;
	@Column(name="POST-PRICE")
	private String PostPrice;
	@Column(name="POST-TYPE")
	private String PostType;
	@Column(name="POST-DETAILS")
	private String PostDetails;
	@Column(name="POST-IMAGES")
	private String PostImages;
	@Column(name="USER-EMAIL")
	private String UserEmail;
	@Column(name="USER-PHONE")
	private String UserPhonenumber;
	@Column(name="USER-ID")
	private String UserId;
	public postDetails(long postId, String postName, String postLocation, String postPrice, String postType,
			String postDetails, String postImages, String userEmail, String userPhonenumber, String userId) {
		super();
		PostId = postId;
		PostName = postName;
		PostLocation = postLocation;
		PostPrice = postPrice;
		PostType = postType;
		PostDetails = postDetails;
		PostImages = postImages;
		UserEmail = userEmail;
		UserPhonenumber = userPhonenumber;
		UserId = userId;
	}
	public long getPostId() {
		return PostId;
	}
	public void setPostId(long postId) {
		PostId = postId;
	}
	public String getPostName() {
		return PostName;
	}
	public void setPostName(String postName) {
		PostName = postName;
	}
	public String getPostLocation() {
		return PostLocation;
	}
	public void setPostLocation(String postLocation) {
		PostLocation = postLocation;
	}
	public String getPostPrice() {
		return PostPrice;
	}
	public void setPostPrice(String postPrice) {
		PostPrice = postPrice;
	}
	public String getPostType() {
		return PostType;
	}
	public void setPostType(String postType) {
		PostType = postType;
	}
	public String getPostDetails() {
		return PostDetails;
	}
	public void setPostDetails(String postDetails) {
		PostDetails = postDetails;
	}
	public String getPostImages() {
		return PostImages;
	}
	public void setPostImages(String postImages) {
		PostImages = postImages;
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
	public postDetails() {
		super();
	}
	@Override
	public String toString() {
		return "postDetails [PostId=" + PostId + ", PostName=" + PostName + ", PostLocation=" + PostLocation
				+ ", PostPrice=" + PostPrice + ", PostType=" + PostType + ", PostDetails=" + PostDetails
				+ ", PostImages=" + PostImages + ", UserEmail=" + UserEmail + ", UserPhonenumber=" + UserPhonenumber
				+ ", UserId=" + UserId + "]";
	}
	
	
}
