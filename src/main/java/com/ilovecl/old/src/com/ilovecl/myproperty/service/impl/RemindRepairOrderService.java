/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.service.impl;

import com.ilovecl.myproperty.DAO.IRemindRepairOrderDAO;
import com.ilovecl.myproperty.model.RemindRepairOrder;
import com.ilovecl.myproperty.service.IRemindRepairOrderService;

import java.util.List;

/**
 * @author ������
 */
public class RemindRepairOrderService implements IRemindRepairOrderService {

    private IRemindRepairOrderDAO remindRepairOrderDAO;

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ilovecl.myproperty.service.IRemindRepairOrderService#addRemindRepairOrder
     * (com.ilovecl.myproperty.model.RemindRepairOrder)
     */
    @Override
    public boolean addRemindRepairOrder(RemindRepairOrder remindRepairOrder) {
        remindRepairOrderDAO.save(remindRepairOrder);

        // ����޷������ݿ��в�ѯ���ü�¼��˵�����Ӵߵ�ʧ��
        if (remindRepairOrderDAO.findByStudentRepairOrderID(
                remindRepairOrder.getStudentRepairOrderID()).size() == 0) {
            return false;
        }

        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ilovecl.myproperty.service.IRemindRepairOrderService#
     * getNotBeenLookedRemindRepairOrders()
     */
    @Override
    public List<RemindRepairOrder> getNotBeenLookedRemindRepairOrders() {
        return remindRepairOrderDAO.findNotBeenLooked();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ilovecl.myproperty.service.IRemindRepairOrderService#
     * lookRemindRepairOrder(com.ilovecl.myproperty.model.RemindRepairOrder)
     */
    @Override
    public boolean lookRemindRepairOrder(int studentRepairOrderID) {

        if (remindRepairOrderDAO.findByStudentRepairOrderID(
                studentRepairOrderID).size() == 1) {

            RemindRepairOrder remindRepairOrder = remindRepairOrderDAO
                    .findByStudentRepairOrderID(studentRepairOrderID).get(0);

            remindRepairOrder.setBeenLooked(RemindRepairOrder.BEEN_LOOKED);

            remindRepairOrderDAO.save(remindRepairOrder);

            // ����޷������ݿ��в�ѯ���ü�¼��˵�����Ӵߵ�ʧ��
            if (remindRepairOrderDAO.findByStudentRepairOrderID(
                    remindRepairOrder.getStudentRepairOrderID()).size() == 0) {
                return false;
            }

            return true;
        }

        return false;
    }

    /**
     * @return the remindRepairOrderDAO
     */
    public IRemindRepairOrderDAO getRemindRepairOrderDAO() {
        return remindRepairOrderDAO;
    }

    /**
     * @param remindRepairOrderDAO the remindRepairOrderDAO to set
     */
    public void setRemindRepairOrderDAO(
            IRemindRepairOrderDAO remindRepairOrderDAO) {
        this.remindRepairOrderDAO = remindRepairOrderDAO;
    }

}
