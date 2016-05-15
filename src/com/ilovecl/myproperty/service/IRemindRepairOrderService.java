/**
 * 
 */
package com.ilovecl.myproperty.service;

import java.util.List;

import com.ilovecl.myproperty.model.RemindRepairOrder;

/**
 * @author ������
 * 
 */
public interface IRemindRepairOrderService {

	// ѧ������һ���ߵ���¼
	public boolean addRemindRepairOrder(RemindRepairOrder remindRepairOrder);

	// ��ҵ����Ա��ѯ����δ�鿴�Ĵߵ���¼
	public List<RemindRepairOrder> getNotBeenLookedRemindRepairOrders();

	// ��ҵ����Ա��һ���ߵ���Ϣ��עΪ�Ѳ鿴
	public boolean lookRemindRepairOrder(int studentRepairOrderID);
}
