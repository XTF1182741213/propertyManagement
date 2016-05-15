/**
 * 
 */
package com.ilovecl.myproperty.service;

import java.util.List;

import com.ilovecl.myproperty.model.RemindRepairOrder;

/**
 * @author 邱永臣
 * 
 */
public interface IRemindRepairOrderService {

	// 学生增加一条催单记录
	public boolean addRemindRepairOrder(RemindRepairOrder remindRepairOrder);

	// 物业管理员查询所有未查看的催单记录
	public List<RemindRepairOrder> getNotBeenLookedRemindRepairOrders();

	// 物业管理员将一条催单信息标注为已查看
	public boolean lookRemindRepairOrder(int studentRepairOrderID);
}
