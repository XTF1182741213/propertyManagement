/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.DAO;

import com.ilovecl.myproperty.model.RemindRepairOrder;

import java.util.List;

/**
 * DAO�㣺�ߵ�DAO�Ľӿ�
 *
 * @author ������
 */
public interface IRemindRepairOrderDAO {
    public abstract void save(RemindRepairOrder transientInstance);

    public abstract void delete(RemindRepairOrder persistentInstance);

    public abstract RemindRepairOrder findById(Integer id);

    public abstract List<RemindRepairOrder> findByStudentRepairOrderID(
            Integer studentRepairOrderID);

    public abstract List<RemindRepairOrder> findNotBeenLooked();

    public abstract boolean isRemindRepairOrderExits(Integer id);
}
