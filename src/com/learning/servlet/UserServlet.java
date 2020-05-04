package com.learning.servlet;

import com.learning.beans.UserAccount;
import com.learning.utils.HttpSessionUtils;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 8619050859443630910L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		UserAccount loginedUser = HttpSessionUtils.getLoginedUser(request.getSession());
//
//		if (loginedUser == null) {
//			response.sendRedirect(request.getContextPath() + "/login");
//			return;
//		}
//
//		request.setAttribute("user", loginedUser);

		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/userView.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}
