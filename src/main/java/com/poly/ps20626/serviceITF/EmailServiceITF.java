package com.poly.ps20626.serviceITF;

import javax.servlet.ServletContext;

import com.poly.ps20626.Entity.Users;

public interface EmailServiceITF {
	abstract void sendEmail(Users recipient,String type);
}
