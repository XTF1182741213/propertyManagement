/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.DAO.impl;

import com.ilovecl.myproperty.DAO.IRemindRepairOrderDAO;
import com.ilovecl.myproperty.model.RemindRepairOrder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author ������
 */
public class RemindRepairOrderDAO extends HibernateDaoSupport implements
        IRemindRepairOrderDAO {
    private static final Log log = LogFactory.getLog(RepairOrderDAO.class);

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ilovecl.myproperty.DAO.IRemindRepairOrderDAO#save(com.ilovecl.myproperty
     * .model.RemindRepairOrder)
     */
    @Override
    public void save(
            com.ilovecl.myproperty.model.RemindRepairOrder transientInstance) {
        log.debug("save(RemindRepairOrder transientInstance) in RemindRepairOrderDAO");
        try {
            this.getHibernateTemplate().saveOrUpdate(transientInstance);
            log.debug("save(RemindRepairOrder transientInstance) in RemindRepairOrderDAO successful");
        } catch (RuntimeException re) {
            log.error(
                    "save(RemindRepairOrder transientInstance) in RemindRepairOrderDAO failed",
                    re);
            throw re;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ilovecl.myproperty.DAO.IRemindRepairOrderDAO#delete(com.ilovecl.
     * myproperty.model.RemindRepairOrder)
     */
    @Override
    public void delete(
            com.ilovecl.myproperty.model.RemindRepairOrder persistentInstance) {
        log.debug("delete(RemindRepairOrder persistentInstance)");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete(RemindRepairOrder persistentInstance) successful");
        } catch (RuntimeException re) {
            log.error("delete(RemindRepairOrder persistentInstance) failed", re);
            throw re;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ilovecl.myproperty.DAO.IRemindRepairOrderDAO#findById(java.lang.Integer
     * )
     */
    @Override
    public RemindRepairOrder findById(Integer id) {
        log.debug("findById(Integer id) : " + id);
        try {
            RemindRepairOrder instance = (RemindRepairOrder) getHibernateTemplate()
                    .get("com.ilovecl.myproperty.model.RemindRepairOrder", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("findById(Integer id) failed", re);
            throw re;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ilovecl.myproperty.DAO.IRemindRepairOrderDAO#findByStudentRepairOrderID
     * (java.lang.Integer)
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<RemindRepairOrder> findByStudentRepairOrderID(
            Integer studentRepairOrderID) {
        List<RemindRepairOrder> remindRepairOrders;
        try {
            String queryString = "from RemindRepairOrder as model where model."
                    + "studentRepairOrderID" + "= ?";
            remindRepairOrders = getHibernateTemplate().find(queryString,
                    studentRepairOrderID);
        } catch (RuntimeException re) {
            log.error("findByUserName failed", re);
            throw re;
        }

        return remindRepairOrders;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ilovecl.myproperty.DAO.IRemindRepairOrderDAO#isRemindRepairOrderExits
     * (java.lang.Integer)
     */
    @Override
    public boolean isRemindRepairOrderExits(Integer id) {
        return !(findById(id) == null);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<RemindRepairOrder> findNotBeenLooked() {
        List<RemindRepairOrder> remindRepairOrders;
        try {
            String queryString = "from RemindRepairOrder as model where model."
                    + "beenLooked" + "= ?";
            remindRepairOrders = getHibernateTemplate().find(queryString,
                    RemindRepairOrder.NOT_BEEN_LOOKED);
        } catch (RuntimeException re) {
            log.error("findByUserName failed", re);
            throw re;
        }

        return remindRepairOrders;
    }

}
