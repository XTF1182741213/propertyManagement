/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.struts.action;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.Date;

/**
 * ���ڴߵ���Action
 *
 * @author ������
 */
@SuppressWarnings("serial")
public class RemindRepairOrderAction extends ActionSupport {

    private int id; // ���޵����
    private String problemDescription; // ������ҵ�ľ�������
    private String place; // ������ҵ�ĵص�
    private String problemImage; // ������ҵ���ֳ�ͼƬ

    private Date launchDate; // ���޵����ϱ�ʱ��
    private String launchDateStr; // ���޵��ϱ�ʱ����ַ�����ʾ

    private int order_status; // ���޵�״̬��0�����ύ���鿴�� 1���Ѳ鿴�����ż��ޣ� 2�������У� 3��������ϣ�
    // 4����ȡ���� 5�����ձ��ã�
    private String order_status_str; // ���޵�״̬���ַ�����ʾ

    private int studentId; // �ύ�ñ��޵���ѧ����ID

    private String studentName; // �ύ�ñ��޵���ѧ��������

    private String remindDateStr; // �ύʱ����ַ�����ʾ

    // ��ȡ���дߵ���Ϣ������Ա��
    public String getAllRemindS() {
        return SUCCESS;
    }

    // ��ȡ���дߵ���Ϣ������Ա��
    public String getAllRemindM() {
        return SUCCESS;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
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
     * @param problemDescription the problemDescription to set
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
     * @param place the place to set
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
     * @param problemImage the problemImage to set
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
     * @param launchDate the launchDate to set
     */
    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    /**
     * @return the launchDateStr
     */
    public String getLaunchDateStr() {
        return launchDateStr;
    }

    /**
     * @param launchDateStr the launchDateStr to set
     */
    public void setLaunchDateStr(String launchDateStr) {
        this.launchDateStr = launchDateStr;
    }

    /**
     * @return the order_status
     */
    public int getOrder_status() {
        return order_status;
    }

    /**
     * @param order_status the order_status to set
     */
    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    /**
     * @return the order_status_str
     */
    public String getOrder_status_str() {
        return order_status_str;
    }

    /**
     * @param order_status_str the order_status_str to set
     */
    public void setOrder_status_str(String order_status_str) {
        this.order_status_str = order_status_str;
    }

    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the remindDateStr
     */
    public String getRemindDateStr() {
        return remindDateStr;
    }

    /**
     * @param remindDateStr the remindDateStr to set
     */
    public void setRemindDateStr(String remindDateStr) {
        this.remindDateStr = remindDateStr;
    }

}
