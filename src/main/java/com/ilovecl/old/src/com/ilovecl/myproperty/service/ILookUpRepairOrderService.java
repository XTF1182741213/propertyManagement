/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.service;

import com.ilovecl.myproperty.DAO.impl.RepairOrderDAO;
import com.ilovecl.myproperty.DAO.impl.StudentDAO;
import com.ilovecl.myproperty.DAO.impl.StudentRepairOrderDAO;
import com.ilovecl.myproperty.model.StudentRepairOrderDetail;
import com.ilovecl.myproperty.model.wrapper.RepairOrderWrapper;
import com.ilovecl.myproperty.model.wrapper.StudentWrapper;

import java.util.List;

/**
 * @author ������
 */
public interface ILookUpRepairOrderService {
    public RepairOrderDAO getRepairOrderDAO();

    public void setRepairOrderDAO(RepairOrderDAO repairOrderDAO);

    public StudentDAO getStudentDAO();

    public void setStudentDAO(StudentDAO studentDAO);

    public StudentRepairOrderDAO getStudentRepairOrderDAO();

    public void setStudentRepairOrderDAO(
            StudentRepairOrderDAO studentRepairOrderDAO);

    /**
     * ����һ�����޵���id����ѯ�����޵��ľ���������ύ�ñ��޵���ѧ��
     *
     * @param repairOrderId ���޵���id
     * @param repairOrder   ���޵��ľ������
     * @param student       �ύ�ñ��޵���ѧ��
     * @return ��ѯ�Ƿ�ɹ�
     */
    public boolean getDetailOfRepairOrder(int repairOrderId,
                                          RepairOrderWrapper repairOrderWrapper, StudentWrapper studentWrapper);

    /**
     * ��ȡ���ݿ�������δ�õ�ִ�еı��޵�
     *
     * @param
     * @return ��ѯ���
     */
    public List<StudentRepairOrderDetail> getAllUnFinishRepairOrders();

    /**
     * ��ȡ���ݿ������� �ı��޵�
     *
     * @param
     * @return ��ѯ���
     */
    public List<StudentRepairOrderDetail> getAllRepairOrders();
}
