/**
 * 
 */
package com.ilovecl.myproperty.DAO;

import java.util.List;

import com.ilovecl.myproperty.model.Student;

/**
 * DAO层：学生DAO的接口
 * @author 邱永臣
 *
 */
public interface IStudentDAO {
	public abstract void save(Student transientInstance);

	public abstract void delete(Student persistentInstance);

	public abstract Student findById(java.lang.Integer id);

	public abstract List<Student> findByUserName(java.lang.String userName);
	
}
