/**
 * 
 */
package com.ilovecl.myproperty.service.impl;

import com.ilovecl.myproperty.DAO.IStudentDAO;
import com.ilovecl.myproperty.model.Student;
import com.ilovecl.myproperty.service.IRegisterService;

/**
 * @author «Ò”¿≥º
 * 
 */
public class RegisterService implements IRegisterService {

	private IStudentDAO studentDAO;

	/**
	 * @return the studentDAO
	 */
	public IStudentDAO getStudentDAO() {
		return studentDAO;
	}

	/**
	 * @param studentDAO
	 *            the studentDAO to set
	 */
	public void setStudentDAO(IStudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ilovecl.myproperty.service.IRegisterService#isStudentExits(java.lang
	 * .String)
	 */
	@Override
	public boolean isStudentExits(String userName) {
		return studentDAO.findByUserName(userName).size() == 1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ilovecl.myproperty.service.IRegisterService#register(java.lang.String
	 * , java.lang.String)
	 */
	@Override
	public boolean register(Student student) {
		if (isStudentExits(student.getUserName())) {
			return false;
		}

		studentDAO.save(student);

		return true;
	}

}
