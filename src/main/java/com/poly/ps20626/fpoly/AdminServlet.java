package com.poly.ps20626.fpoly;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.apache.commons.beanutils.BeanUtils;

import com.poly.ps20626.Constant.SessiconAttr;
import com.poly.ps20626.Entity.*;
import com.poly.ps20626.service.*;
import com.poly.ps20626.serviceITF.*;

@WebServlet({ "/netflix/admin", "/netflix/favoritebyuser" })
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 115218195474121L;
	private RpVideoService rpVideo = new RpVideoService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Users currentUser = (Users) session.getAttribute(SessiconAttr.CURRENT_USER);

		String path = req.getServletPath();
		if (currentUser != null) {
			List<VideoLikedInfo> videos = rpVideo.findVideoLikedInfo();
			System.out.println("Nè nha " + videos.size());
			req.setAttribute("videos", videos);
			req.getRequestDispatcher("/views/admin/report-manage.jsp").forward(req, resp);
		} else {
			resp.sendRedirect("/PhamGiaHaoASM/netflix/index");
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/admin/report-manage.jsp").forward(req, resp);

	}

	protected void doGetAdmin(HttpSession session, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}

//	protected void doGetFavoriteByUser(HttpSession session, HttpServletRequest req, HttpServletResponse resp)
//			throws ServletException, IOException {
//
//		PrintWriter out = resp.getWriter();
//		resp.setCharacterEncoding("UTF-8");
//		resp.setContentType("application/json");
//
//		String videoHref = req.getParameter("href");
//
//		List<Users> users = userService.findUsersLikedVideoByVideoHref(videoHref);
//		if (users.isEmpty()) {
//			resp.setStatus(400);
//		} else {
////			ObjectMapper mapper = new ObjectMapper();
//		}
//	}
}