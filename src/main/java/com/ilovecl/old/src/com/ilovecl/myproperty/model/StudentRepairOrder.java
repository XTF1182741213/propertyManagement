/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.model;

/**
 * ��¼ѧ���ͱ��޵�֮��Ĺ�ϵ���ĸ�ѧ���ύ���ĸ����޵���
 *
 * @author ������
 *         <p>
 *         create table `StudentRepairOrder` ( `id` int not null primary key
 *         auto_increment, `studentId` int not null, `repairOrderId` int not
 *         null) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
public class StudentRepairOrder {
    private int id;
    private int studentId; // ѧ��id
    private int repairOrderId; // ���޵�id

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
     * @return the repairOrderId
     */
    public int getRepairOrderId() {
        return repairOrderId;
    }

    /**
     * @param repairOrderId the repairOrderId to set
     */
    public void setRepairOrderId(int repairOrderId) {
        this.repairOrderId = repairOrderId;
    }

}
