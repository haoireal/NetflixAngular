package com.poly.ps20626.fpoly;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.poly.ps20626.Until.*;
import com.poly.ps20626.service.EmailService;
import com.poly.ps20626.service.UserService;
import com.poly.ps20626.serviceITF.EmailServiceITF;
import com.poly.ps20626.serviceITF.UserServiceITF;
import com.poly.ps20626.Entity.*;
import com.poly.ps20626.Constant.SessiconAttr;
import com.poly.ps20626.DAO.*;
import java.util.*;

@WebServlet({ "/netflix/login", "/netflix/signup", "/netflix/logout", "/netflix/verifi", "/netflix/send_verifi",
		"/netflix/forgetpassword" })
public class AccountControlServlet extends HttpServlet {

	private static final long serialVersionUID = 5037589279838319447L;

	private UserServiceITF userService = new UserService();
	private EmailServiceITF emailService = new EmailService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String path = req.getServletPath();
		switch (path) {
		case "/netflix/login": {
			doGetLogin(req, resp);
			break;
		}
		case "/netflix/signup": {
			doGetSignUp(req, resp);
			break;
		}
		case "/netflix/logout": {
			doGetLogout(session, req, resp);
			break;
		}
		case "/netflix/verifi": {
			doGetVerifi(session, req, resp);
			break;
		}
		case "/netflix/forgetpassword": {
			doGetForget(session, req, resp);
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + path);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String path = req.getServletPath();
		switch (path) {
		case "/netflix/login": {
			doPostLogin(session, req, resp);
			break;
		}
		case "/netflix/signup": {
			doPostSignUp(session, req, resp);
			break;
		}
		case "/netflix/verifi": {
			doPostVerifi(session, req, resp);
			break;
		}
		case "/netflix/forgetpassword": {
			doPostForget(session, req, resp);
			break;
		}
		default:
		}
	}

	private void doGetLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// đọc giá trị của cookie
				String email = CookieUtils.get("email", req);
				String password = CookieUtils.get("password", req);
				// chuyển sang login để hiển thị lên form
				req.setAttribute("email", email);
				req.setAttribute("password", password);
		req.getRequestDispatcher("/views/Account/login.jsp").forward(req, resp);
	}

	private void doGetSignUp(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/Account/signup.jsp").forward(req, resp);
	}

	private void doGetLogout(HttpSession session, HttpServletRequest req, HttpServletResponse resp) throws IOException {
		session.removeAttribute(SessiconAttr.CURRENT_USER);
		resp.sendRedirect("/PhamGiaHaoASM/netflix/login");
	}
	private void doGetForget(HttpSession session, HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		req.getRequestDispatcher("/views/Account/quenmatkhau.jsp").forward(req, resp);
	}
	private void doGetVerifi(HttpSession session, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/views/Account/verifi_code.jsp").forward(req, resp);
	}

	private void doPostLogin(HttpSession session, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String remember = req.getParameter("remember");
		int hours = (remember == null) ? 0 : 30 * 24; // 0 = xóa
		
		CookieUtils.add("email", email, hours, resp);
		CookieUtils.add("password", password, hours, resp);
		
		Users user = userService.Login(email, password);

		if (user != null) {
			if(user.isAdmin()) {
				session.setAttribute(SessiconAttr.CURRENT_USER, user);
				resp.sendRedirect("/PhamGiaHaoASM/netflix/admin");
			}else {
				session.setAttribute(SessiconAttr.CURRENT_USER, user);
				resp.sendRedirect("/PhamGiaHaoASM/netflix/index");
			}
			
		} else {
			resp.sendRedirect("/PhamGiaHaoASM/netflix/login");
		}

	}

	private void doPostSignUp(HttpSession session, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String fullname = req.getParameter("fullname");

		Users user = userService.create(email, password, fullname);
		if (user != null) {
			session.setAttribute(SessiconAttr.CURRENT_USER, user);
			System.out.println("email ne: "+user.getEmail());
			emailService.sendEmail(user, "code");
			resp.sendRedirect("/PhamGiaHaoASM/netflix/verifi");
		} else {
			resp.sendRedirect("/PhamGiaHaoASM/netflix/login");
		}

	}

	private void doPostVerifi(HttpSession session, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String code = "";
		for (int i = 1; i <= 5; i++) {
			code += req.getParameter("o" + i);
		}
		System.out.println("input is " + code);

		Users user = (Users) session.getAttribute(SessiconAttr.CURRENT_USER);

		if (user.getVericode() == Integer.parseInt(code)) {
			user.setIsveri(true);
			userService.update(user);
			session.setAttribute(SessiconAttr.CURRENT_USER, user);
			resp.sendRedirect("/PhamGiaHaoASM/netflix/index");
		} else {
			try {
				resp.sendRedirect("/PhamGiaHaoASM/netflix/verifi");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void doPostForget(HttpSession session, HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String email = req.getParameter("email");
		String oldpassword = req.getParameter("oldpassword");
		String password = req.getParameter("password");
		String cfpassword = req.getParameter("cfpassword");
		Users user = userService.findByEmail(email);
		String message;
		if(user.getPassword().equals(oldpassword)) {
			user.setPassword(cfpassword);
			userService.update(user);
			
			req.setAttribute("message","Đổi mật khẩu thành công");
			session.setAttribute(SessiconAttr.CURRENT_USER, user);
			resp.sendRedirect("/PhamGiaHaoASM/netflix/index");
		}else {
			req.setAttribute("message","Đổi mật khẩu thành công");
			resp.sendRedirect("/PhamGiaHaoASM/netflix/login");
		}
		
	}
}