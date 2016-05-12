/**
 * 
 */
package com.ilovecl.myproperty.model;

import java.util.Date;

/**
 * 保修单实体
 * 
 * @author 邱永臣
 * 
 */
public class RepairOrder {
	private long id; // 
	private String problemDescription; // 故障物业的具体描述
	private String place; // 故障物业的地点
	private String problemImage; // 故障物业的现场图片
	private Date launchDate; // 保修单的上报时间

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
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
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place
	 *            the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * @return the problemImage
	 */
	public String getProblemImage() {
		return problemImage;
	}

	/**
	 * @param problemImage
	 *            the problemImage to set
	 */
	public void setProblemImage(String problemImage) {
		this.problemImage = problemImage;
	}

	/**
	 * @return the launchDate
	 */
	public Date getLaunchDate() {
		return launchDate;
	}

	/**
	 * @param launchDate
	 *            the launchDate to set
	 */
	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}

}
