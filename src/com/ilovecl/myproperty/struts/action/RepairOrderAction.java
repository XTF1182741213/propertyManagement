/**
 * 
 */
package com.ilovecl.myproperty.struts.action;

import java.sql.Date;
import java.util.List;

import com.ilovecl.myproperty.model.RepairOrder;
import com.ilovecl.myproperty.model.Student;
import com.ilovecl.myproperty.model.StudentRepairOrderDetail;
import com.ilovecl.myproperty.service.ILookUpRepairOrderService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 邱永臣
 * 
 */
@SuppressWarnings("serial")
public class RepairOrderAction extends ActionSupport {
	private int id; //
	private String problemDescription; // 故障物业的具体描述
	private String place; // 故障物业的地点
	private String problemImage; // 故障物业的现场图片

	private Date launchDate; // 保修单的上报时间
	private String launchDateStr; // 报修单上报时间的字符串表示

	private int order_status; // 保修单状态（0：新提交待查看， 1：已查看待安排检修， 2：检修中， 3：检修完毕，
								// 4：被取消， 5：留空备用）
	private String order_status_str; // 保修单状态的字符串表示

	private int studentId; // 提交该报修单的学生的ID

	private String studentName; // 提交该报修单的学生的名字

	private List<StudentRepairOrderDetail> getdate;

	private ILookUpRepairOrderService lookUpRepairOrderService;

	private RepairOrder repairOrder;

	private Student student;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	public String delete() {
		return SUCCESS;
	}

	public String getAllToBeCanceled() {
		return SUCCESS;
	}

	/**
	 * 学生获取所有自己的报修单
	 * 
	 * @return
	 */
	public String getAllS() {

		getdate = lookUpRepairOrderService.getAllRepairOrders();
		return SUCCESS;
	}

	// 查看未完成的报修单（管理员）
	public String getUnFinishM() {
		getdate = lookUpRepairOrderService.getAllRepairOrders();
		return SUCCESS;
	}

	// 查看已完成的报修单（管理员）
	public String getFinishM() {
		getdate = lookUpRepairOrderService.getAllRepairOrders();
		return SUCCESS;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the problemDescription
	 */
	public String getProblemDescription() {
		return problemDescription;
	}

	/**
	 * @param problemDescription
	 *            the problemDescription to set
	 */
	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place
	 *            the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * @return the problemImage
	 */
	public String getProblemImage() {
		return problemImage;
	}

	/**
	 * @param problemImage
	 *            the problemImage to set
	 */
	public void setProblemImage(String problemImage) {
		this.problemImage = problemImage;
	}

	/**
	 * @return the launchDate
	 */
	public Date getLaunchDate() {
		return launchDate;
	}

	/**
	 * @param launchDate
	 *            the launchDate to set
	 */
	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}

	/**
	 * @return the launchDateStr
	 */
	public String getLaunchDateStr() {
		return launchDateStr;
	}

	/**
	 * @param launchDateStr
	 *            the launchDateStr to set
	 */
	public void setLaunchDateStr(String launchDateStr) {
		this.launchDateStr = launchDateStr;
	}

	/**
	 * @return the order_status
	 */
	public int getOrder_status() {
		return order_status;
	}

	/**
	 * @param order_status
	 *            the order_status to set
	 */
	public void setOrder_status(int order_status) {
		this.order_status = order_status;
	}

	/**
	 * @return the order_status_str
	 */
	public String getOrder_status_str() {
		return order_status_str;
	}

	/**
	 * @param order_status_str
	 *            the order_status_str to set
	 */
	public void setOrder_status_str(String order_status_str) {
		this.order_status_str = order_status_str;
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId
	 *            the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName
	 *            the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the getdate
	 */
	public List<StudentRepairOrderDetail> getGetdate() {
		return getdate;
	}

	/**
	 * @param getdate
	 *            the getdate to set
	 */
	public void setGetdate(List<StudentRepairOrderDetail> getdate) {
		this.getdate = getdate;
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

}
