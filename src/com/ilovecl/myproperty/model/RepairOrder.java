/**
 * 
 */
package com.ilovecl.myproperty.model;

import java.sql.Date;

/**
 * 保修单实体
 * 
 * @author 邱永臣
 * 
 *         对应的数据库建表命令为
 * 
 *         create table `RepairOrder` ( `id` int not null primary key
 *         auto_increment, `problemDescription` varchar(2048) not null, `place`
 *         varchar(200) not null, `problemImage` varchar(200), `launchDate`
 *         Datetime, `order_status` int not null) ENGINE=InnoDB DEFAULT
 *         CHARSET=utf8;
 */
public class RepairOrder {
	private int id; //
	private String problemDescription; // 故障物业的具体描述
	private String place; // 故障物业的地点
	private String problemImage; // 故障物业的现场图片
	private Date launchDate; // 保修单的上报时间
	private int order_status; // 保修单状态（0：新提交待查看， 1：已查看待安排检修， 2：检修中， 3：检修完毕，
								// 4：被取消， 5：留空备用）

	/**
	 * 
	 */
	public RepairOrder() {
		super();
	}

	public RepairOrder(String problemDescription2, String place2, String md5,
			java.sql.Date date) {
		problemDescription = problemDescription2;
		place = place2;
		problemImage = md5;
		launchDate = date;
		order_status = ORDER_STATUS.NEW;
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

}
