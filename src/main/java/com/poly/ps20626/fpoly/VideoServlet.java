package com.poly.ps20626.fpoly;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.apache.commons.beanutils.BeanUtils;

import com.poly.ps20626.Constant.SessiconAttr;
import com.poly.ps20626.Entity.Favorite;
import com.poly.ps20626.Entity.Users;
import com.poly.ps20626.Entity.Video;
import com.poly.ps20626.service.FavoriteService;
import com.poly.ps20626.service.VideoService;
import com.poly.ps20626.serviceITF.FavoriteServiceITF;
import com.poly.ps20626.serviceITF.VideoServiceITF;

@WebServlet({ "/netflix/detail-video" })
public class VideoServlet extends HttpServlet {
	private static final long serialVersionUID = 8086386960524348569L;
	private VideoServiceITF videoService = new VideoService();
	private FavoriteServiceITF favoriteService = new FavoriteService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String actionParam = req.getParameter("action");
		String href = req.getParameter("id");
		HttpSession session = req.getSession();
		System.out.println(actionParam);
		switch (actionParam) {
		case "detail": {
			doGetDetail(session, href, req, resp);
			break;
		}
		case "like": {
			doGetLike(session, href, req, resp);
			break;
		}
		default:
			System.out.println(actionParam);
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	private void doGetDetail(HttpSession session, String href, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Video video = videoService.findByHref(href);
		req.setAttribute("video", video);
		Users currentUser = (Users) session.getAttribute(SessiconAttr.CURRENT_USER);
		Favorite isFvr = favoriteService.findByUserIDAndVideoID(currentUser.getId(), video.getId());
		if (isFvr == null) {
			favoriteService.create(currentUser, video);
		}
		isFvr = favoriteService.findByUserIDAndVideoID(currentUser.getId(), video.getId());	
		req.setAttribute("flagFavoriteBtn", isFvr.isLiked());
		req.getRequestDispatcher("/views/user/detail-video.jsp").forward(req, resp);
	}

	private void doGetLike(HttpSession session, String href, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("application/json");
		Users currentUser = (Users) session.getAttribute(SessiconAttr.CURRENT_USER);
		boolean rs = favoriteService.updateLikeOrUnlike(currentUser, href);
		if (rs == true) {
			resp.setStatus(204); // sucsess but no data
		} else {
			resp.setStatus(400);
		}

	}
}