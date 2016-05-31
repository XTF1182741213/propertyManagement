/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.DAO.impl;

import com.ilovecl.myproperty.DAO.IRepairOrderDAO;
import com.ilovecl.myproperty.model.RepairOrder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author ������
 */
public class RepairOrderDAO extends HibernateDaoSupport implements
        IRepairOrderDAO {
    private static final Log log = LogFactory.getLog(RepairOrderDAO.class);

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ilovecl.myproperty.DAO.IRepairOrderDAO#save(com.ilovecl.myproperty
     * .model.RepairOrder)
     */
    @Override
    public void save(RepairOrder transientInstance) {
        log.debug("save(RepairOrder transientInstance) in RepairOrderDAO");
        try {
            this.getHibernateTemplate().findByExample(transientInstance);
            this.getHibernateTemplate().saveOrUpdate(transientInstance);
            log.debug("save(RepairOrder transientInstance) in RepairOrderDAO successful");
        } catch (RuntimeException re) {
            log.error(
                    "save(RepairOrder transientInstance) in RepairOrderDAO failed",
                    re);
            throw re;
        }

    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ilovecl.myproperty.DAO.IRepairOrderDAO#delete(com.ilovecl.myproperty
     * .model.RepairOrder)
     */
    @Override
    public void delete(RepairOrder persistentInstance) {
        log.debug("delete(RepairOrder persistentInstance)");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete(RepairOrder persistentInstance) successful");
        } catch (RuntimeException re) {
            log.error("delete(RepairOrder persistentInstance) failed", re);
            throw re;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ilovecl.myproperty.DAO.IRepairOrderDAO#findById(java.lang.Integer)
     */
    @Override
    public RepairOrder findById(Integer id) {
        log.debug("findById(Integer id) : " + id);
        try {
            RepairOrder instance = (RepairOrder) getHibernateTemplate().get(
                    "com.ilovecl.myproperty.model.RepairOrder", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("findById(Integer id) failed", re);
            throw re;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<RepairOrder> findByProblemDescription(String problemDescription) {
        List<RepairOrder> repairOrders;
        try {
            String queryString = "from RepairOrder as model where model."
                    + "problemDescription" + "= ?";
            repairOrders = getHibernateTemplate().find(queryString,
                    problemDescription);
        } catch (RuntimeException re) {
            log.error("findByUserName failed", re);
            throw re;
        }

        return repairOrders;
    }

    @Override
    public boolean isRepairOrderExits(int id) {
        return !(findById(id) == null);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<RepairOrder> findByExample(RepairOrder repairOrder) {
        log.debug("findByExample(RepairOrder repairOrder) : "
                + repairOrder.getId());

        List<RepairOrder> list;
        try {
            list = this.getHibernateTemplate()
                    .find("from RepairOrder as model");

            return list;
        } catch (RuntimeException re) {
            log.error("findByExample(RepairOrder repairOrder) failed", re);
            throw re;
        }
    }
}
