/**
 * 
 */
package com.ilovecl.myproperty.DAO.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ilovecl.myproperty.DAO.IRepairOrderDAO;
import com.ilovecl.myproperty.model.RepairOrder;

/**
 * @author «Ò”¿≥º
 * 
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

}
