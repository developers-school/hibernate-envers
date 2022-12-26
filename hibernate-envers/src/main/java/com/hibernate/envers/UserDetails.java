package com.hibernate.envers;

import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity	
@Audited
public class UserDetails {

	@Id
    private Integer userId;
    private String pageName;
    private Integer followersCount;
    
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public Integer getFollowersCount() {
		return followersCount;
	}
	public void setFollowersCount(Integer followersCount) {
		this.followersCount = followersCount;
	}
	public UserDetails(Integer userId, String pageName, Integer followersCount) {
		super();
		this.userId = userId;
		this.pageName = pageName;
		this.followersCount = followersCount;
	}
    
	
    
}
