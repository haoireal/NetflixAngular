package com.poly.ps20626.fpoly;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.apache.commons.beanutils.BeanUtils;
import com.poly.ps20626.Until.*;

@WebServlet("/checkjsphaha")
public class SignupServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8084561960524348569L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/admin/report-manage.jsp").forward(req, resp);

	}


}