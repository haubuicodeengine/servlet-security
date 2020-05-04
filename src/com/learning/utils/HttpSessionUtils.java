package com.learning.utils;

import com.learning.beans.UserAccount;

import javax.servlet.http.HttpSession;

public class HttpSessionUtils {

	public static UserAccount getLoginedUser(HttpSession httpSession) {
		return (UserAccount) httpSession.getAttribute(PARAM_LOGINED_USER);
	}

	public static void setLoginedUser(HttpSession httpSession, UserAccount loginedUser) {
		httpSession.setAttribute(PARAM_LOGINED_USER, loginedUser);
	}

	private static final String PARAM_LOGINED_USER = "loginedUser";
}
