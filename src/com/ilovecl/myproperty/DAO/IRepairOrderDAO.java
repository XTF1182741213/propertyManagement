/**
 * 
 */
package com.ilovecl.myproperty.DAO;

import com.ilovecl.myproperty.model.RepairOrder;

/**
 * DAO�㣺���϶���DAO�Ľӿ�
 * 
 * @author ������
 * 
 */
public interface IRepairOrderDAO {
	public abstract void save(RepairOrder transientInstance);

	public abstract void delete(RepairOrder persistentInstance);

	public abstract RepairOrder findById(java.lang.Integer id);

}
