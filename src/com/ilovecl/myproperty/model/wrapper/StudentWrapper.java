/**
 * 
 */
package com.ilovecl.myproperty.model.wrapper;

import com.ilovecl.myproperty.model.Student;

/**
 * StudentµÄ°ü×°Æ÷
 * 
 * @author ÇñÓÀ³¼
 * 
 */
public class StudentWrapper {
	private Student student;

	public StudentWrapper(Student student) {
		this.student = student;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student
	 *            the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

}
