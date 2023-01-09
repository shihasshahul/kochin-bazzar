package com.postdetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="favourites")
public class favouritesDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="FAV-ID")
	private long FavId;
	@Column(name="POST-ID")
	private long PostId;
	@Column(name="USER-ID")
	private long UserId;
	
	
	
	public favouritesDetails(long favId, long postId, long userId) {
		super();
		FavId = favId;
		PostId = postId;
		UserId = userId;
	}
	public long getFavId() {
		return FavId;
	}
	public void setFavId(long favId) {
		FavId = favId;
	}
	public long getPostId() {
		return PostId;
	}
	public void setPostId(long postId) {
		PostId = postId;
	}
	public long getUserId() {
		return UserId;
	}
	public void setUserId(long userId) {
		UserId = userId;
	}
	public favouritesDetails() {
		super();
	}
	@Override
	public String toString() {
		return "Favourites [FavId=" + FavId + ", PostId=" + PostId + ", UserId=" + UserId + "]";
	}
	
	

}
