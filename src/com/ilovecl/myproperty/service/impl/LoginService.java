/**
 * 
 */
package com.ilovecl.myproperty.service.impl;

import com.ilovecl.myproperty.DAO.impl.PropertyManagerDAO;
import com.ilovecl.myproperty.DAO.impl.StudentDAO;
import com.ilovecl.myproperty.service.ILoginService;

/**
 * @author 邱永臣
 * 
 */
public class LoginService implements ILoginService {
	private StudentDAO studentDAO;
	private PropertyManagerDAO propertyManagerDAO;

	/**
	 * @return the studentDAO
	 */
	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	/**
	 * @param studentDAO
	 *            the studentDAO to set
	 */
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	/**
	 * @return the propertyManagerDAO
	 */
	public PropertyManagerDAO getPropertyManagerDAO() {
		return propertyManagerDAO;
	}

	/**
	 * @param propertyManagerDAO
	 *            the propertyManagerDAO to set
	 */
	public void setPropertyManagerDAO(PropertyManagerDAO propertyManagerDAO) {
		this.propertyManagerDAO = propertyManagerDAO;
	}

	/* 如果密码正确就能登录 */
	@Override
	public boolean studentLogin(String userName, String password) {
		// 该学生必须存在
		if (!isStudentExits(userName)) {
			return false;
		}

		return studentDAO.findByUserName(userName).get(0).getPassword()
				.equals(password);
	}

	@Override
	public boolean isStudentExits(String userName) {
		return studentDAO.findByUserName(userName).size() == 1;
	}

	/* 如果密码正确就能登录 */
	@Override
	public boolean propertyManagerLogin(String userName, String password) {
		// 该物业管理员必须存在
		if (!isPropertyManagerExits(userName))
			return false;

		return propertyManagerDAO.findByUserName(userName).get(0).getPassword()
				.equals(password);
	}

	@Override
	public boolean isPropertyManagerExits(String userName) {
		return propertyManagerDAO.findByUserName(userName).size() == 1;
	}

}
