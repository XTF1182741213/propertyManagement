/**
 * 
 */
package com.ilovecl.myproperty.DAO;

import java.util.List;

import com.ilovecl.myproperty.model.RemindRepairOrder;

/**
 * DAO�㣺�ߵ�DAO�Ľӿ�
 * 
 * @author ������
 * 
 */
public interface IRemindRepairOrderDAO {
	public abstract void save(RemindRepairOrder transientInstance);

	public abstract void delete(RemindRepairOrder persistentInstance);

	public abstract RemindRepairOrder findById(java.lang.Integer id);

	public abstract List<RemindRepairOrder> findByStudentRepairOrderID(
			java.lang.Integer studentRepairOrderID);

	public abstract List<RemindRepairOrder> findNotBeenLooked();

	public abstract boolean isRemindRepairOrderExits(java.lang.Integer id);
}
