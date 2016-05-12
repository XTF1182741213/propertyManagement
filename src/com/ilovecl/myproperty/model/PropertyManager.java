/**
 * 
 */
package com.ilovecl.myproperty.model;

/**
 * 物业管理员实体
 * 
 * @author 邱永臣
 * 
 *         对应的数据库建表命令为 :
 * 
 *         create table `PropertyManager` ( `userId` int not null primary key
 *         auto_increment, `userName` varchar(20) not null, `password`
 *         varchar(20) not null);
 */
public class PropertyManager {
	private int userId;
	private String userName;
	private String password;

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

}
