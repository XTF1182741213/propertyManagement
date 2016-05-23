/**
 * 
 */
package com.ilovecl.myproperty.struts.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author «Ò”¿≥º
 * 
 */
@SuppressWarnings("serial")
public class RepairingManagerAction extends ActionSupport {
	int id;
	String problemDescription;
	String sumitDateStr;
	String toRepairDateString;
	String isFinishRepairString;
	String order_status_str;
	int repairerId;
	String repairerName;

	public String getAllRepairingManager() {
		return SUCCESS;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the problemDescription
	 */
	public String getProblemDescription() {
		return problemDescription;
	}

	/**
	 * @param problemDescription
	 *            the problemDescription to set
	 */
	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	/**
	 * @return the sumitDateStr
	 */
	public String getSumitDateStr() {
		return sumitDateStr;
	}

	/**
	 * @param sumitDateStr
	 *            the sumitDateStr to set
	 */
	public void setSumitDateStr(String sumitDateStr) {
		this.sumitDateStr = sumitDateStr;
	}

	/**
	 * @return the toRepairDateString
	 */
	public String getToRepairDateString() {
		return toRepairDateString;
	}

	/**
	 * @param toRepairDateString
	 *            the toRepairDateString to set
	 */
	public void setToRepairDateString(String toRepairDateString) {
		this.toRepairDateString = toRepairDateString;
	}

	/**
	 * @return the isFinishRepairString
	 */
	public String getIsFinishRepairString() {
		return isFinishRepairString;
	}

	/**
	 * @param isFinishRepairString
	 *            the isFinishRepairString to set
	 */
	public void setIsFinishRepairString(String isFinishRepairString) {
		this.isFinishRepairString = isFinishRepairString;
	}

	/**
	 * @return the order_status_str
	 */
	public String getOrder_status_str() {
		return order_status_str;
	}

	/**
	 * @param order_status_str
	 *            the order_status_str to set
	 */
	public void setOrder_status_str(String order_status_str) {
		this.order_status_str = order_status_str;
	}

	/**
	 * @return the repairerId
	 */
	public int getRepairerId() {
		return repairerId;
	}

	/**
	 * @param repairerId
	 *            the repairerId to set
	 */
	public void setRepairerId(int repairerId) {
		this.repairerId = repairerId;
	}

	/**
	 * @return the repairerName
	 */
	public String getRepairerName() {
		return repairerName;
	}

	/**
	 * @param repairerName
	 *            the repairerName to set
	 */
	public void setRepairerName(String repairerName) {
		this.repairerName = repairerName;
	}

}
