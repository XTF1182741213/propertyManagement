/**
 * 
 */
package com.ilovecl.myproperty.service;

import java.util.List;

import com.ilovecl.myproperty.DAO.impl.RepairOrderDAO;
import com.ilovecl.myproperty.DAO.impl.StudentDAO;
import com.ilovecl.myproperty.DAO.impl.StudentRepairOrderDAO;
import com.ilovecl.myproperty.model.StudentRepairOrderDetail;
import com.ilovecl.myproperty.model.wrapper.RepairOrderWrapper;
import com.ilovecl.myproperty.model.wrapper.StudentWrapper;

/**
 * @author 邱永臣
 * 
 */
public interface ILookUpRepairOrderService {
	public RepairOrderDAO getRepairOrderDAO();

	public void setRepairOrderDAO(RepairOrderDAO repairOrderDAO);

	public StudentDAO getStudentDAO();

	public void setStudentDAO(StudentDAO studentDAO);

	public StudentRepairOrderDAO getStudentRepairOrderDAO();

	public void setStudentRepairOrderDAO(
			StudentRepairOrderDAO studentRepairOrderDAO);

	/**
	 * 传入一个报修单的id，查询到保修单的具体情况和提交该保修单的学生
	 * 
	 * @param repairOrderId
	 *            报修单的id
	 * @param repairOrder
	 *            报修单的具体情况
	 * @param student
	 *            提交该报修单的学生
	 * @return 查询是否成功
	 */
	public boolean getDetailOfRepairOrder(int repairOrderId,
			RepairOrderWrapper repairOrderWrapper, StudentWrapper studentWrapper);

	/**
	 * 获取数据库中所有未得到执行的报修单
	 * 
	 * @param
	 * 
	 * @return 查询结果
	 * */
	public List<StudentRepairOrderDetail> getAllUnFinishRepairOrders();

	/**
	 * 获取数据库中所有 的报修单
	 * 
	 * @param
	 * 
	 * @return 查询结果
	 * */
	public List<StudentRepairOrderDetail> getAllRepairOrders();
}
