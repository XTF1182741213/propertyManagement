/**
 * 
 */
package com.ilovecl.myproperty.DAO;

import java.util.List;

import com.ilovecl.myproperty.model.StudentRepairOrder;

/**
 * DAO�㣺ѧ���ͱ��޵���ӦDAO�Ľӿ�
 * 
 * @author ������
 * 
 */
public interface IStudentRepairOrderDAO {
	public abstract void save(StudentRepairOrder transientInstance);

	public abstract void delete(StudentRepairOrder persistentInstance);

	public abstract StudentRepairOrder findById(java.lang.Integer id);

	public abstract List<StudentRepairOrder> findByStudentId(
			java.lang.Integer id);

	public abstract List<StudentRepairOrder> findByRepairOrderId(
			java.lang.Integer id);
}
