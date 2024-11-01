package com.ecom.Capstone_Backend.Response;

import java.util.List;

import com.ecom.Capstone_Backend.Entity.User;

public class UserListResponse {
	
	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	

}
