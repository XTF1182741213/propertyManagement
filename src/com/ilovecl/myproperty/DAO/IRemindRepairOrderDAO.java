/**
 * 
 */
package com.ilovecl.myproperty.DAO;

import java.util.List;

import com.ilovecl.myproperty.model.RemindRepairOrder;

/**
 * DAO层：催单DAO的接口
 * 
 * @author 邱永臣
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
