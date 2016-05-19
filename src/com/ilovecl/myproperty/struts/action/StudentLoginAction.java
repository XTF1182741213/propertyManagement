/**
 * 
 */
package com.ilovecl.myproperty.struts.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.ilovecl.myproperty.service.ILoginService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户登录功能的Action类
 * 
 * @author 邱永臣
 * 
 */
@SuppressWarnings("serial")
public class StudentLoginAction extends ActionSupport {
	private String userName;
	private String password;
	private String message;

	private ILoginService loginService;

	public String login() throws IOException {
		HttpServletResponse resp = ServletActionContext.getResponse();
		resp.setHeader("pragma", "no-cache");
		resp.setHeader("cache-control", "no-cache");
		PrintWriter out = resp.getWriter();
		if (loginService.studentLogin(userName, password)) {
			out.print(0);

		} else {
			out.print(1);
		}
		out.flush();
		return NONE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		this.message = "";

		if (this.userName.equals("")) {
			this.message += "用户名为空！\n";
			return INPUT;
		} else if (this.password.equals("")) {
			this.message += "密码为空！\n";
			return INPUT;
		}

		if (!loginService.isStudentExits(userName)) {
			this.message += "账户不存在！";
			return INPUT;
		}

		if (loginService.studentLogin(userName, password)) {
			this.message = "登录成功";
			return SUCCESS;
		} else {
			this.message = "注册失败";
			return INPUT;
		}

	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the loginService
	 */
	public ILoginService getLoginService() {
		return loginService;
	}

	/**
	 * @param loginService
	 *            the loginService to set
	 */
	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}

}
