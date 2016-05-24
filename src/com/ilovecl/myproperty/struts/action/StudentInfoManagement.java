/**
 * 
 */
package com.ilovecl.myproperty.struts.action;

import java.util.List;

import com.ilovecl.myproperty.model.Student;
import com.ilovecl.myproperty.service.IPersInfoManagService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 学生个人信息管理
 * 
 * @author 邱永臣
 * 
 */
@SuppressWarnings("serial")
public class StudentInfoManagement extends ActionSupport {

	private int userId;
	private String userName;
	private String password;
	private long phoneNumber;
	private String email;
	private String sexual;

	private List<Student> getdate;

	private IPersInfoManagService persInfoManagService;

	public String getInfo() {
		return SUCCESS;
	}

	/**
	 * @return the persInfoManagService
	 */
	public IPersInfoManagService getPersInfoManagService() {
		return persInfoManagService;
	}

	/**
	 * @param persInfoManagService
	 *            the persInfoManagService to set
	 */
	public void setPersInfoManagService(
			IPersInfoManagService persInfoManagService) {
		this.persInfoManagService = persInfoManagService;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
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
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the sexual
	 */
	public String getSexual() {
		return sexual;
	}

	/**
	 * @param sexual
	 *            the sexual to set
	 */
	public void setSexual(String sexual) {
		this.sexual = sexual;
	}

	/**
	 * @return the getDate
	 */
	public List<Student> getGetDate() {
		return getdate;
	}

	/**
	 * @param getDate
	 *            the getDate to set
	 */
	public void setGetDate(List<Student> getDate) {
		this.getdate = getDate;
	}

}
