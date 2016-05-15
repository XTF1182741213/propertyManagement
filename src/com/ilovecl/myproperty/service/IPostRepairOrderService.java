/**
 * 
 */
package com.ilovecl.myproperty.service;

import com.ilovecl.myproperty.DAO.impl.RepairOrderDAO;
import com.ilovecl.myproperty.model.RepairOrder;

/**
 * @author «Ò”¿≥º
 * 
 */
public interface IPostRepairOrderService {
	public RepairOrderDAO getRepairOrderDAO();

	public void setRepairOrderDAO(RepairOrderDAO repairOrderDAO);
	
	public boolean postRepairOrder(RepairOrder repairOrder);
}
