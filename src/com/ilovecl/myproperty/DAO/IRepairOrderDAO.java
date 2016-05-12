/**
 * 
 */
package com.ilovecl.myproperty.DAO;

import com.ilovecl.myproperty.model.RepairOrder;

/**
 * DAO层：保障订单DAO的接口
 * 
 * @author 邱永臣
 * 
 */
public interface IRepairOrderDAO {
	public abstract void save(RepairOrder transientInstance);

	public abstract void delete(RepairOrder persistentInstance);

	public abstract RepairOrder findById(java.lang.Integer id);

}
