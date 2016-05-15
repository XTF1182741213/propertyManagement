/**
 * 
 */
package com.ilovecl.myproperty.service.impl;

import com.ilovecl.myproperty.DAO.impl.RepairOrderDAO;
import com.ilovecl.myproperty.model.RepairOrder;
import com.ilovecl.myproperty.service.IPostRepairOrderService;

/**
 * @author 邱永臣
 * 
 */
public class PostRepairOrderService implements IPostRepairOrderService {
	private RepairOrderDAO repairOrderDAO;

	/**
	 * @return the repairOrderDAO
	 */
	@Override
	public RepairOrderDAO getRepairOrderDAO() {
		return repairOrderDAO;
	}

	/**
	 * @param repairOrderDAO
	 *            the repairOrderDAO to set
	 */
	@Override
	public void setRepairOrderDAO(RepairOrderDAO repairOrderDAO) {
		this.repairOrderDAO = repairOrderDAO;
	}

	@Override
	public boolean postRepairOrder(RepairOrder repairOrder) {
		repairOrderDAO.save(repairOrder);

		// 提交到数据库后，能从数据库中查询到，说明插入成功
		return !repairOrderDAO.findByProblemDescription(
				repairOrder.getProblemDescription()).isEmpty();
	}

}
