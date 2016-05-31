/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.DAO;

import com.ilovecl.myproperty.model.RepairOrder;

import java.util.List;

/**
 * DAO�㣺���޶���DAO�Ľӿ�
 *
 * @author ������
 */
public interface IRepairOrderDAO {
    public abstract void save(RepairOrder transientInstance);

    public abstract void delete(RepairOrder persistentInstance);

    public abstract RepairOrder findById(Integer id);

    public abstract List<RepairOrder> findByExample(RepairOrder repairOrder);

    public abstract List<RepairOrder> findByProblemDescription(
            String problemDescription);

    boolean isRepairOrderExits(int id);
}
