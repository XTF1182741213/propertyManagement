/**
 * 
 */
package com.ilovecl.myproperty.model;

import java.util.Date;

/**
 * ���޵�ʵ��
 * 
 * @author ������
 * 
 */
public class RepairOrder {
	private long id; // 
	private String problemDescription; // ������ҵ�ľ�������
	private String place; // ������ҵ�ĵص�
	private String problemImage; // ������ҵ���ֳ�ͼƬ
	private Date launchDate; // ���޵����ϱ�ʱ��

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
