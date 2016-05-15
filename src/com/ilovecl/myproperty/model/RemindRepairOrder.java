/**
 * 
 */
package com.ilovecl.myproperty.model;

import java.sql.Date;

/**
 * 催单的目标订单
 * 
 * @author 邱永臣
 * 
 *         create table `RemindRepairOrder` ( `id` int not null primary key
 *         auto_increment, `studentRepairOrderID` int not null, `beenLooked` int
 *         not null, `remindDate` Datetime) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
public class RemindRepairOrder {
	public static final int BEEN_LOOKED = 0;
	public static final int NOT_BEEN_LOOKED = 1;

	private int id;
	private int studentRepairOrderID; // 学生和保修单之间的关系表的ID，用来查找具体的订单（同时追溯出提交人和订单）
	private int beenLooked; // 是否已被管理员查看过(0表示是，1表示否)
	private Date remindDate; // 催单时间

	public RemindRepairOrder() {

	}

	public RemindRepairOrder(int studentRepairOrderID, Date remindDate) {
		this.studentRepairOrderID = studentRepairOrderID;
		this.remindDate = remindDate;
		this.beenLooked = NOT_BEEN_LOOKED;
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
	 * @return the studentRepairOrderID
	 */
	public int getStudentRepairOrderID() {
		return studentRepairOrderID;
	}

	/**
	 * @param studentRepairOrderID
	 *            the studentRepairOrderID to set
	 */
	public void setStudentRepairOrderID(int studentRepairOrderID) {
		this.studentRepairOrderID = studentRepairOrderID;
	}

	/**
	 * @return the beenLooked
	 */
	public int getBeenLooked() {
		return beenLooked;
	}

	/**
	 * @param beenLooked
	 *            the beenLooked to set
	 */
	public void setBeenLooked(int beenLooked) {
		this.beenLooked = beenLooked;
	}

	/**
	 * @return the remindDate
	 */
	public Date getRemindDate() {
		return remindDate;
	}

	/**
	 * @param remindDate
	 *            the remindDate to set
	 */
	public void setRemindDate(Date remindDate) {
		this.remindDate = remindDate;
	}

}
