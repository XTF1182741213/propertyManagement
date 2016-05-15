/**
 * 
 */
package com.ilovecl.myproperty.model.wrapper;

import com.ilovecl.myproperty.model.RepairOrder;

/**
 * RepairOrderµÄ°ü×°Æ÷
 * 
 * @author ÇñÓÀ³¼
 * 
 */
public class RepairOrderWrapper {
	private RepairOrder repairOrder;

	public RepairOrderWrapper(RepairOrder repairOrder) {
		this.repairOrder = repairOrder;
	}

	/**
	 * @return the repairOrder
	 */
	public RepairOrder getRepairOrder() {
		return repairOrder;
	}

	/**
	 * @param repairOrder
	 *            the repairOrder to set
	 */
	public void setRepairOrder(RepairOrder repairOrder) {
		this.repairOrder = repairOrder;
	}

}
