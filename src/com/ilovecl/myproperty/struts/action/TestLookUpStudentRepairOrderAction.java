/**
 * 
 */
package com.ilovecl.myproperty.struts.action;

import com.ilovecl.myproperty.model.RepairOrder;
import com.ilovecl.myproperty.model.Student;
import com.ilovecl.myproperty.model.wrapper.RepairOrderWrapper;
import com.ilovecl.myproperty.model.wrapper.StudentWrapper;
import com.ilovecl.myproperty.service.ILookUpRepairOrderService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author «Ò”¿≥º
 * 
 */
@SuppressWarnings("serial")
public class TestLookUpStudentRepairOrderAction extends ActionSupport {
	private ILookUpRepairOrderService lookUpRepairOrderService;

	private RepairOrder repairOrder;

	private Student student;

	private String repairOrderDetailString;

	private String studentUserNameString;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		student = new Student();
		repairOrder = new RepairOrder();

		
		RepairOrderWrapper repairOrderWrapper = new RepairOrderWrapper(
				repairOrder);
		StudentWrapper studentWrapper = new StudentWrapper(student);

		student.setUserName("test");
		
		lookUpRepairOrderService.getDetailOfRepairOrder(1, repairOrderWrapper,
				studentWrapper);

		// repairOrderWrapper.getRepairOrder().setPlace("hello");
		repairOrderDetailString = repairOrderWrapper.getRepairOrder()
				.getPlace();

		studentUserNameString = studentWrapper.getStudent().getUserName();

		return SUCCESS;
	}

	/**
	 * @return the lookUpRepairOrderService
	 */
	public ILookUpRepairOrderService getLookUpRepairOrderService() {
		return lookUpRepairOrderService;
	}

	/**
	 * @param lookUpRepairOrderService
	 *            the lookUpRepairOrderService to set
	 */
	public void setLookUpRepairOrderService(
			ILookUpRepairOrderService lookUpRepairOrderService) {
		this.lookUpRepairOrderService = lookUpRepairOrderService;
	}

	/**
	 * @return the repairOrder
	 */
	public RepairOrder getRepairOrder() {
		return repairOrder;
	}

	/**
	 * @param repairOrder
	 *            the repairOrder to set
	 */
	public void setRepairOrder(RepairOrder repairOrder) {
		this.repairOrder = repairOrder;
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

	/**
	 * @return the repairOrderDetailString
	 */
	public String getRepairOrderDetailString() {
		return repairOrderDetailString;
	}

	/**
	 * @param repairOrderDetailString
	 *            the repairOrderDetailString to set
	 */
	public void setRepairOrderDetailString(String repairOrderDetailString) {
		this.repairOrderDetailString = repairOrderDetailString;
	}

	/**
	 * @return the studentUserNameString
	 */
	public String getStudentUserNameString() {
		return studentUserNameString;
	}

	/**
	 * @param studentUserNameString
	 *            the studentUserNameString to set
	 */
	public void setStudentUserNameString(String studentUserNameString) {
		this.studentUserNameString = studentUserNameString;
	}

}
