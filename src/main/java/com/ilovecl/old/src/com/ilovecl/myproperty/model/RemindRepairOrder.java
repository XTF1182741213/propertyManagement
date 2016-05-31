/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.model;

import java.sql.Date;

/**
 * �ߵ���Ŀ�궩��
 *
 * @author ������
 *         <p>
 *         create table `RemindRepairOrder` ( `id` int not null primary key
 *         auto_increment, `studentRepairOrderID` int not null, `beenLooked` int
 *         not null, `remindDate` Datetime) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
public class RemindRepairOrder {
    public static final int BEEN_LOOKED = 0;
    public static final int NOT_BEEN_LOOKED = 1;

    private int id;
    private int studentRepairOrderID; // ѧ���ͱ��޵�֮��Ĺ�ϵ���ID���������Ҿ���Ķ�����ͬʱ׷�ݳ��ύ�˺Ͷ�����
    private int beenLooked; // �Ƿ��ѱ�����Ա�鿴��(0��ʾ�ǣ�1��ʾ��)
    private Date remindDate; // �ߵ�ʱ��

    public RemindRepairOrder() {

    }

    public RemindRepairOrder(int studentRepairOrderID, Date remindDate) {
        this.studentRepairOrderID = studentRepairOrderID;
        this.remindDate = remindDate;
        this.beenLooked = NOT_BEEN_LOOKED;
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
     * @return the studentRepairOrderID
     */
    public int getStudentRepairOrderID() {
        return studentRepairOrderID;
    }

    /**
     * @param studentRepairOrderID the studentRepairOrderID to set
     */
    public void setStudentRepairOrderID(int studentRepairOrderID) {
        this.studentRepairOrderID = studentRepairOrderID;
    }

    /**
     * @return the beenLooked
     */
    public int getBeenLooked() {
        return beenLooked;
    }

    /**
     * @param beenLooked the beenLooked to set
     */
    public void setBeenLooked(int beenLooked) {
        this.beenLooked = beenLooked;
    }

    /**
     * @return the remindDate
     */
    public Date getRemindDate() {
        return remindDate;
    }

    /**
     * @param remindDate the remindDate to set
     */
    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

}
