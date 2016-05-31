/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.struts.action;

import com.ilovecl.myproperty.model.RepairOrder;
import com.ilovecl.myproperty.model.Student;
import com.ilovecl.myproperty.model.StudentRepairOrderDetail;
import com.ilovecl.myproperty.service.ILookUpRepairOrderService;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.Date;
import java.util.List;

/**
 * @author ������
 */
@SuppressWarnings("serial")
public class RepairOrderAction extends ActionSupport {
    private int id; //
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

    private List<StudentRepairOrderDetail> getdate;

    private ILookUpRepairOrderService lookUpRepairOrderService;

    private RepairOrder repairOrder;

    private Student student;

    /*
     * (non-Javadoc)
     *
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    @Override
    public String execute() throws Exception {
        // TODO Auto-generated method stub
        return super.execute();
    }

    public String delete() {
        return SUCCESS;
    }

    public String getAllToBeCanceled() {
        return SUCCESS;
    }

    /**
     * ѧ����ȡ�����Լ��ı��޵�
     *
     * @return
     */
    public String getAllS() {

        getdate = lookUpRepairOrderService.getAllRepairOrders();
        return SUCCESS;
    }

    // �鿴δ��ɵı��޵�������Ա��
    public String getUnFinishM() {
        getdate = lookUpRepairOrderService.getAllRepairOrders();
        return SUCCESS;
    }

    // �鿴����ɵı��޵�������Ա��
    public String getFinishM() {
        getdate = lookUpRepairOrderService.getAllRepairOrders();
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
     * @return the getdate
     */
    public List<StudentRepairOrderDetail> getGetdate() {
        return getdate;
    }

    /**
     * @param getdate the getdate to set
     */
    public void setGetdate(List<StudentRepairOrderDetail> getdate) {
        this.getdate = getdate;
    }

    /**
     * @return the lookUpRepairOrderService
     */
    public ILookUpRepairOrderService getLookUpRepairOrderService() {
        return lookUpRepairOrderService;
    }

    /**
     * @param lookUpRepairOrderService the lookUpRepairOrderService to set
     */
    public void setLookUpRepairOrderService(
            ILookUpRepairOrderService lookUpRepairOrderService) {
        this.lookUpRepairOrderService = lookUpRepairOrderService;
    }

    /**
     * @return the repairOrder
     */
    public RepairOrder getRepairOrder() {
        return repairOrder;
    }

    /**
     * @param repairOrder the repairOrder to set
     */
    public void setRepairOrder(RepairOrder repairOrder) {
        this.repairOrder = repairOrder;
    }

    /**
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

}
