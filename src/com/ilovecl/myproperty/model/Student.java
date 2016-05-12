/**
 * 
 */
package com.ilovecl.myproperty.model;

/**
 * 学生实体
 * 
 * @author 邱永臣
 * 
 *         对应的数据库建表命令为 create table `Student` ( `userId` int not null primary
 *         key auto_increment, `userName` varchar(20) not null, `password`
 *         varchar(20) not null, `phoneNumber` long, `email` varchar(100),
 *         `sexual` varchar(10));
 */

public class Student {
	private int userId;
	private String userName;
	private String password;
	private long phoneNumber;
	private String email;
	private String sexual;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String userName2, String password2, long phoneNumber2,
			String email2, String sexual2) {
		this.userName = userName2;
		this.password = password2;
		this.phoneNumber = phoneNumber2;
		this.email = email2;
		this.sexual = sexual2;
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

}
