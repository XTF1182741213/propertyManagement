/**
 * 
 */
package com.ilovecl.myproperty.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ilovecl.myproperty.DAO.impl.RepairOrderDAO;
import com.ilovecl.myproperty.DAO.impl.StudentDAO;
import com.ilovecl.myproperty.DAO.impl.StudentRepairOrderDAO;
import com.ilovecl.myproperty.model.RepairOrder;
import com.ilovecl.myproperty.model.Student;
import com.ilovecl.myproperty.model.StudentRepairOrderDetail;
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

		// TODO 此处因“值传递”的关系，应该不起作用，待修改为包装器引用
		// repairOrder.setProblemDescription(repairOrder2.getProblemDescription());

		int studentId = studentRepairOrderDAO
				.findByRepairOrderId(repairOrderId).get(0).getId();

		studentWrapper.setStudent(studentDAO.findById(studentId));

		// studentWrapper.getStudent().setUserName("hi");
		// TODO 此处因“值传递”的关系，应该不起作用，待修改为包装器引用
		// student.setUserName(studentDAO.findById(studentId).getUserName());

		return true;
	}

	@Override
	public List<StudentRepairOrderDetail> getAllUnFinishRepairOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentRepairOrderDetail> getAllRepairOrders() {
		RepairOrder repairOrder = new RepairOrder();
		Student student = new Student();
		List<StudentRepairOrderDetail> studentRepairOrderDetails = new ArrayList<>();

		List<RepairOrder> repairOrders = repairOrderDAO
				.findByExample(repairOrder);

		for (int i = 0; i < repairOrders.size(); i++) {
			repairOrder = repairOrders.get(i);
			student = studentDAO.findById(studentRepairOrderDAO
					.findByRepairOrderId(repairOrder.getId()).get(0).getId());

			studentRepairOrderDetails.add(new StudentRepairOrderDetail(
					repairOrder.getId(), repairOrder.getProblemDescription(),
					repairOrder.getPlace(), repairOrder.getProblemImage(),
					repairOrder.getLaunchDate(), repairOrder.getOrder_status(),
					student.getUserId(), student.getUserName()));
		}

		return studentRepairOrderDetails;
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
