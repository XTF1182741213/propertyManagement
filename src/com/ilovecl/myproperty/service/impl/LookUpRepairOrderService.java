/**
 * 
 */
package com.ilovecl.myproperty.service.impl;

import com.ilovecl.myproperty.DAO.impl.RepairOrderDAO;
import com.ilovecl.myproperty.DAO.impl.StudentDAO;
import com.ilovecl.myproperty.DAO.impl.StudentRepairOrderDAO;
import com.ilovecl.myproperty.model.RepairOrder;
import com.ilovecl.myproperty.model.wrapper.RepairOrderWrapper;
import com.ilovecl.myproperty.model.wrapper.StudentWrapper;
import com.ilovecl.myproperty.service.ILookUpRepairOrderService;

/**
 * @author DELL
 * 
 */
public class LookUpRepairOrderService implements ILookUpRepairOrderService {
	private RepairOrderDAO repairOrderDAO;
	private StudentDAO studentDAO;
	private StudentRepairOrderDAO studentRepairOrderDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ilovecl.myproperty.service.ILookUpRepairOrderService#
	 * getDetailOfRepairOrder(int, com.ilovecl.myproperty.model.RepairOrder,
	 * com.ilovecl.myproperty.model.Student)
	 */
	@Override
	public boolean getDetailOfRepairOrder(int repairOrderId,
			RepairOrderWrapper repairOrderWrapper, StudentWrapper studentWrapper) {
		RepairOrder repairOrder2 = repairOrderDAO.findById(repairOrderId);

		repairOrderWrapper.setRepairOrder(repairOrder2);

		// TODO �˴���ֵ���ݡ��Ĺ�ϵ��Ӧ�ò������ã����޸�Ϊ��װ������
		// repairOrder.setProblemDescription(repairOrder2.getProblemDescription());

		int studentId = studentRepairOrderDAO
				.findByRepairOrderId(repairOrderId).get(0).getId();

		studentWrapper.setStudent(studentDAO.findById(studentId));

		// studentWrapper.getStudent().setUserName("hi");
		// TODO �˴���ֵ���ݡ��Ĺ�ϵ��Ӧ�ò������ã����޸�Ϊ��װ������
		// student.setUserName(studentDAO.findById(studentId).getUserName());

		return true;
	}

	/**
	 * @return the repairOrderDAO
	 */
	@Override
	public RepairOrderDAO getRepairOrderDAO() {
		return repairOrderDAO;
	}

	/**
	 * @param repairOrderDAO
	 *            the repairOrderDAO to set
	 */
	@Override
	public void setRepairOrderDAO(RepairOrderDAO repairOrderDAO) {
		this.repairOrderDAO = repairOrderDAO;
	}

	/**
	 * @return the studentDAO
	 */
	@Override
	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	/**
	 * @param studentDAO
	 *            the studentDAO to set
	 */
	@Override
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	/**
	 * @return the studentRepairOrderDAO
	 */
	@Override
	public StudentRepairOrderDAO getStudentRepairOrderDAO() {
		return studentRepairOrderDAO;
	}

	/**
	 * @param studentRepairOrderDAO
	 *            the studentRepairOrderDAO to set
	 */
	@Override
	public void setStudentRepairOrderDAO(
			StudentRepairOrderDAO studentRepairOrderDAO) {
		this.studentRepairOrderDAO = studentRepairOrderDAO;
	}

}
