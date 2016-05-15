/**
 * 
 */
package com.ilovecl.myproperty.DAO;

import java.util.List;

import com.ilovecl.myproperty.model.RepairOrder;

/**
 * DAO�㣺���޶���DAO�Ľӿ�
 * 
 * @author ������
 * 
 */
public interface IRepairOrderDAO {
	public abstract void save(RepairOrder transientInstance);

	public abstract void delete(RepairOrder persistentInstance);

	public abstract RepairOrder findById(java.lang.Integer id);

	public abstract List<RepairOrder> findByProblemDescription(
			java.lang.String problemDescription);

	boolean isRepairOrderExits(int id);
}
