package com.poly.ps20626.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletContext;

import com.poly.ps20626.Entity.Users;
import com.poly.ps20626.Until.EmailUntil;
import com.poly.ps20626.serviceITF.EmailServiceITF;

public class EmailService implements EmailServiceITF {
	private static final String EMAIL_VERIFI_FORGOT = "ĐÂY LÀ MÃ XÁC THỰC CỦA BẠN CHO TRONG NETFLIX CỦA HAOIREAL";
	private static final String EMAIL_SHARE = "MỘT NGƯỜI BẠN ĐÃ CHIA SẼ CHO BẠN VIDEO NÀY HÃY CÙNG VÀO XEM NHÉ!";
	EmailUntil emailUntil = new EmailUntil();

	@Override
	public void sendEmail(Users recipient, String type) {

		try {
			String content = null;
			String subject = null;
			switch (type) {
			case "code": {
				subject = EMAIL_VERIFI_FORGOT;
				content = "Giử " + recipient.getFullname()
						+ ", đây là mã xác thực của bạn tại NETFLIX HAOIREAL " + recipient.getVericode();
			}
				break;
			case "share": {
				subject = EMAIL_SHARE;

			}
			default:
			}

			// send message
			emailUntil.setup(subject, content, recipient.getEmail());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
