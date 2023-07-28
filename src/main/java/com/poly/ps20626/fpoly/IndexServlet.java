package com.poly.ps20626.fpoly;

import java.io.IOException;
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

@WebServlet({ "/netflix/indexwtlogin", "/netflix/index", "/netflix/search" })
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1156816495474121L;
	private VideoServiceITF videoService = new VideoService();
	private FavoriteServiceITF favoriteService = new FavoriteService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String path = req.getServletPath();
		switch (path) {
		case "/netflix/indexwtlogin": {
			doGetIndexWTLogin(session, req, resp);
			break;
		}
		case "/netflix/index": {
			doGetIndex(session, req, resp);
			break;
		}
		case "/netflix/search": {
			doGetSearch(session, req, resp);
			break;
		}
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String path = req.getServletPath();
		switch (path) {
		case "/netflix/indexwtlogin": {
			doPostIndexWTLogin(session, req, resp);
			break;
		}
		}

	}

	protected void doGetIndexWTLogin(HttpSession session, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.getRequestDispatcher("/views/indexwtlogin.jsp").forward(req, resp);
	}

	protected void doPostIndexWTLogin(HttpSession session, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String email = req.getParameter("email");
		req.setAttribute("email", email);
		req.getRequestDispatcher("/views/Account/signup.jsp").forward(req, resp);
	}

	protected void doGetIndex(HttpSession session, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<Video> videos = videoService.findAll();
		Users currentUser = (Users) session.getAttribute(SessiconAttr.CURRENT_USER);
		List<Favorite> favorites = favoriteService.findByUserAndIsFavorite(currentUser.getEmail());
		List<Video> fvrVideos = new ArrayList<>();
		favorites.forEach(item -> fvrVideos.add(item.getVideo()));

		req.setAttribute("fvrVideos", fvrVideos);
		req.setAttribute("videos", videos);

		req.getRequestDispatcher("/views/user/index.jsp").forward(req, resp);
	}

	protected void doGetSearch(HttpSession session, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String keyword = req.getParameter("search");
		List<Video> videos = videoService.findByKeyWord(keyword);
		req.setAttribute("videos", videos);
		req.getRequestDispatcher("/views/user/index.jsp").forward(req, resp);
	}
}