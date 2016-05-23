/**
 * 
 */
package com.ilovecl.myproperty.model;

import java.sql.Date;

/**
 * 报修单信息和学生信息
 * 
 * @author 邱永臣
 * 
 */
public class StudentRepairOrderDetail {
	private final int id; //
	private final String problemDescription; // 故障物业的具体描述
	private final String place; // 故障物业的地点
	private final String problemImage; // 故障物业的现场图片

	private final Date launchDate; // 保修单的上报时间
	private final String launchDateStr; // 报修单上报时间的字符串表示

	private final int order_status; // 保修单状态（0：新提交待查看， 1：已查看待安排检修， 2：检修中，
									// 3：检修完毕，
	// 4：被取消， 5：留空备用）
	private final String order_status_str; // 保修单状态的字符串表示

	private final int studentId; // 提交该报修单的学生的ID

	private final String studentName; // 提交该报修单的学生的名字

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the problemDescription
	 */
	public String getProblemDescription() {
		return problemDescription;
	}

	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @return the problemImage
	 */
	public String getProblemImage() {
		return problemImage;
	}

	/**
	 * @return the launchDate
	 */
	public Date getLaunchDate() {
		return launchDate;
	}

	/**
	 * @return the launchDateStr
	 */
	public String getLaunchDateStr() {
		return launchDateStr;
	}

	/**
	 * @return the order_status
	 */
	public int getOrder_status() {
		return order_status;
	}

	/**
	 * @return the order_status_str
	 */
	public String getOrder_status_str() {
		return order_status_str;
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param id
	 * @param problemDescription
	 * @param place
	 * @param problemImage
	 * @param launchDate
	 * @param launchDateStr
	 * @param order_status
	 * @param order_status_str
	 * @param studentId
	 * @param studentName
	 */
	public StudentRepairOrderDetail(int id, String problemDescription,
			String place, String problemImage, Date launchDate,
			String launchDateStr, int order_status, String order_status_str,
			int studentId, String studentName) {
		this.id = id;
		this.problemDescription = problemDescription;
		this.place = place;
		this.problemImage = problemImage;
		this.launchDate = launchDate;
		this.launchDateStr = launchDateStr;
		this.order_status = order_status;
		this.order_status_str = order_status_str;
		this.studentId = studentId;
		this.studentName = studentName;
	}

	/**
	 * @param id
	 * @param problemDescription
	 * @param place
	 * @param problemImage
	 * @param launchDateStr
	 * @param order_status_str
	 * @param studentId
	 * @param studentName
	 */
	public StudentRepairOrderDetail(int id, String problemDescription,
			String place, String problemImage, Date launchDate,
			int order_status, int studentId, String studentName) {
		this.id = id;
		this.problemDescription = problemDescription;
		this.place = place;
		this.problemImage = problemImage;
		this.launchDate = launchDate;
		this.launchDateStr = launchDate.toString();
		this.order_status = order_status;
		this.order_status_str = ORDER_STATUS.STATUS_STR[order_status];
		this.studentId = studentId;
		this.studentName = studentName;
	}

}
