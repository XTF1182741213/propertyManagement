/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.model;

import java.sql.Date;

/**
 * ���޵���Ϣ��ѧ����Ϣ
 *
 * @author ������
 */
public class StudentRepairOrderDetail {
    private final int id; //
    private final String problemDescription; // ������ҵ�ľ�������
    private final String place; // ������ҵ�ĵص�
    private final String problemImage; // ������ҵ���ֳ�ͼƬ

    private final Date launchDate; // ���޵����ϱ�ʱ��
    private final String launchDateStr; // ���޵��ϱ�ʱ����ַ�����ʾ

    private final int order_status; // ���޵�״̬��0�����ύ���鿴�� 1���Ѳ鿴�����ż��ޣ� 2�������У�
    // 3��������ϣ�
    // 4����ȡ���� 5�����ձ��ã�
    private final String order_status_str; // ���޵�״̬���ַ�����ʾ

    private final int studentId; // �ύ�ñ��޵���ѧ����ID

    private final String studentName; // �ύ�ñ��޵���ѧ��������

    /**
     * @param id
     * @param problemDescription
     * @param place
     * @param problemImage
     * @param launchDate
     * @param launchDateStr
     * @param order_status
     * @param order_status_str
     * @param studentId
     * @param studentName
     */
    public StudentRepairOrderDetail(int id, String problemDescription,
                                    String place, String problemImage, Date launchDate,
                                    String launchDateStr, int order_status, String order_status_str,
                                    int studentId, String studentName) {
        this.id = id;
        this.problemDescription = problemDescription;
        this.place = place;
        this.problemImage = problemImage;
        this.launchDate = launchDate;
        this.launchDateStr = launchDateStr;
        this.order_status = order_status;
        this.order_status_str = order_status_str;
        this.studentId = studentId;
        this.studentName = studentName;
    }

    /**
     * @param id
     * @param problemDescription
     * @param place
     * @param problemImage
     * @param launchDateStr
     * @param order_status_str
     * @param studentId
     * @param studentName
     */
    public StudentRepairOrderDetail(int id, String problemDescription,
                                    String place, String problemImage, Date launchDate,
                                    int order_status, int studentId, String studentName) {
        this.id = id;
        this.problemDescription = problemDescription;
        this.place = place;
        this.problemImage = problemImage;
        this.launchDate = launchDate;
        this.launchDateStr = launchDate.toString();
        this.order_status = order_status;
        this.order_status_str = ORDER_STATUS.STATUS_STR[order_status];
        this.studentId = studentId;
        this.studentName = studentName;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the problemDescription
     */
    public String getProblemDescription() {
        return problemDescription;
    }

    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @return the problemImage
     */
    public String getProblemImage() {
        return problemImage;
    }

    /**
     * @return the launchDate
     */
    public Date getLaunchDate() {
        return launchDate;
    }

    /**
     * @return the launchDateStr
     */
    public String getLaunchDateStr() {
        return launchDateStr;
    }

    /**
     * @return the order_status
     */
    public int getOrder_status() {
        return order_status;
    }

    /**
     * @return the order_status_str
     */
    public String getOrder_status_str() {
        return order_status_str;
    }

    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

}
