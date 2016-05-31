/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.service.impl;

import com.ilovecl.myproperty.DAO.impl.RepairOrderDAO;
import com.ilovecl.myproperty.model.RepairOrder;
import com.ilovecl.myproperty.service.IPostRepairOrderService;

/**
 * @author ������
 */
public class PostRepairOrderService implements IPostRepairOrderService {
    private RepairOrderDAO repairOrderDAO;

    /**
     * @return the repairOrderDAO
     */
    @Override
    public RepairOrderDAO getRepairOrderDAO() {
        return repairOrderDAO;
    }

    /**
     * @param repairOrderDAO the repairOrderDAO to set
     */
    @Override
    public void setRepairOrderDAO(RepairOrderDAO repairOrderDAO) {
        this.repairOrderDAO = repairOrderDAO;
    }

    @Override
    public boolean postRepairOrder(RepairOrder repairOrder) {
        repairOrderDAO.save(repairOrder);

        // �ύ�����ݿ���ܴ����ݿ��в�ѯ����˵������ɹ�
        return !repairOrderDAO.findByProblemDescription(
                repairOrder.getProblemDescription()).isEmpty();
    }

}
