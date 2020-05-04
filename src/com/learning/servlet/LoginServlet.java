package com.learning.servlet;

import com.learning.beans.UserAccount;
import com.learning.utils.HttpSessionUtils;
import com.learning.utils.StringUtils;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/login" }, loadOnStartup = 1)
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		String errorString = null;
		boolean hasError = false;
		UserAccount user = null;

		if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
			hasError = true;
			errorString = "Required User Name and Password";
		} else {

			// TODO: connect to db
			if (userName.equals("hau") && password.equals("test")) {
				user = new UserAccount(userName, password);
			}

			if (user == null) {
				hasError = true;
				errorString = "User Name or Password invalid";
			}
		}

		if (hasError) {
			request.setAttribute("errorString", errorString);
			RequestDispatcher dispatcher = this.getServletContext()
					.getRequestDispatcher("/WEB-INF/views/login.jsp");
			dispatcher.forward(request, response);
		} else {
			HttpSessionUtils.setLoginedUser(request.getSession(), user);
			response.sendRedirect(request.getContextPath() + "/user");
		}
	}
}
