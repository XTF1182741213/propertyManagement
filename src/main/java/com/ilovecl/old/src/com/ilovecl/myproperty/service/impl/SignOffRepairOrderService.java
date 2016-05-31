/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.service.impl;

import com.ilovecl.myproperty.DAO.impl.RepairOrderDAO;
import com.ilovecl.myproperty.DAO.impl.StudentDAO;
import com.ilovecl.myproperty.DAO.impl.StudentRepairOrderDAO;
import com.ilovecl.myproperty.model.ORDER_STATUS;
import com.ilovecl.myproperty.model.RepairOrder;
import com.ilovecl.myproperty.service.ISignOffRepairOrderService;

/**
 * @author ������
 */
public class SignOffRepairOrderService implements ISignOffRepairOrderService {
    private StudentDAO studentDAO;
    private RepairOrderDAO repairOrderDAO;
    private StudentRepairOrderDAO studentRepairOrderDAO;

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ilovecl.myproperty.service.ISignOffRepairOrderService#signOff(int,
     * java.lang.String)
     */
    @Override
    public boolean signOff(int repairOrderId, String studentUserName) {
        // ������
        if (!studentDAO.isStudentExits(studentUserName)
                || !repairOrderDAO.isRepairOrderExits(repairOrderId)
                || studentRepairOrderDAO.findByRepairOrderId(repairOrderId)
                .size() == 0) {
            return false;
        }

        // ��������״̬��Ϊ��ǩ�ա�
        RepairOrder r = repairOrderDAO.findById(repairOrderId);
        r.setOrder_status(ORDER_STATUS.SIGNOFF);

        // �־û���RepairOrder��
        repairOrderDAO.save(r);

        if (repairOrderDAO.findByProblemDescription(r.getProblemDescription())
                .size() == 1) {
            return true;
        }

        return false;
    }

    /**
     * @return the studentDAO
     */
    public StudentDAO getStudentDAO() {
        return studentDAO;
    }

    /**
     * @param studentDAO the studentDAO to set
     */
    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    /**
     * @return the repairOrderDAO
     */
    public RepairOrderDAO getRepairOrderDAO() {
        return repairOrderDAO;
    }

    /**
     * @param repairOrderDAO the repairOrderDAO to set
     */
    public void setRepairOrderDAO(RepairOrderDAO repairOrderDAO) {
        this.repairOrderDAO = repairOrderDAO;
    }

    /**
     * @return the studentRepairOrderDAO
     */
    public StudentRepairOrderDAO getStudentRepairOrderDAO() {
        return studentRepairOrderDAO;
    }

    /**
     * @param studentRepairOrderDAO the studentRepairOrderDAO to set
     */
    public void setStudentRepairOrderDAO(
            StudentRepairOrderDAO studentRepairOrderDAO) {
        this.studentRepairOrderDAO = studentRepairOrderDAO;
    }

}
