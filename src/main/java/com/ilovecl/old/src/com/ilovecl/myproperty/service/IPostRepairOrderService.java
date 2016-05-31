/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.service;

import com.ilovecl.myproperty.DAO.impl.RepairOrderDAO;
import com.ilovecl.myproperty.model.RepairOrder;

/**
 * @author ������
 */
public interface IPostRepairOrderService {
    public RepairOrderDAO getRepairOrderDAO();

    public void setRepairOrderDAO(RepairOrderDAO repairOrderDAO);

    public boolean postRepairOrder(RepairOrder repairOrder);
}
