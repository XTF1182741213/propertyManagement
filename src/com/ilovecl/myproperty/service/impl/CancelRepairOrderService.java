/**
 * 
 */
package com.ilovecl.myproperty.service.impl;

import com.ilovecl.myproperty.DAO.impl.RepairOrderDAO;
import com.ilovecl.myproperty.DAO.impl.StudentDAO;
import com.ilovecl.myproperty.DAO.impl.StudentRepairOrderDAO;
import com.ilovecl.myproperty.model.ORDER_STATUS;
import com.ilovecl.myproperty.model.RepairOrder;
import com.ilovecl.myproperty.service.ICancelRepairOrderService;

/**
 * @author 邱永臣
 * 
 */
public class CancelRepairOrderService implements ICancelRepairOrderService {

	private StudentDAO studentDAO;
	private RepairOrderDAO repairOrderDAO;
	private StudentRepairOrderDAO studentRepairOrderDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ilovecl.myproperty.service.ICancelRepairOrderService#cancel(int,
	 * int)
	 */
	@Override
	public boolean cancel(int repairOrderId, String studentUserName) {
		// 连表检测
		if (!studentDAO.isStudentExits(studentUserName)
				|| repairOrderDAO.isRepairOrderExits(repairOrderId)
				|| studentRepairOrderDAO.findByRepairOrderId(repairOrderId)
						.size() == 0) {
			return false;
		}

		// 将订单的状态改为“取消”
		RepairOrder r = repairOrderDAO.findById(repairOrderId);
		r.setOrder_status(ORDER_STATUS.CANCELED);

		// 持久化到RepairOrder表
		repairOrderDAO.save(r);

		if (repairOrderDAO.findByProblemDescription(r.getProblemDescription())
				.size() == 1) {
			return true;
		}

		return false;
	}
}
