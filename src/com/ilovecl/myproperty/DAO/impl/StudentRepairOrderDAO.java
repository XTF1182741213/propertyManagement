/**
 * 
 */
package com.ilovecl.myproperty.DAO.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ilovecl.myproperty.DAO.IStudentRepairOrderDAO;
import com.ilovecl.myproperty.model.StudentRepairOrder;

/**
 * @author «Ò”¿≥º
 * 
 */
public class StudentRepairOrderDAO extends HibernateDaoSupport implements
		IStudentRepairOrderDAO {
	private static final Log log = LogFactory
			.getLog(StudentRepairOrderDAO.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ilovecl.myproperty.DAO.IStudentRepairOrderDAO#save(com.ilovecl.myproperty
	 * .model.StudentRepairOrder)
	 */
	@Override
	public void save(StudentRepairOrder transientInstance) {
		log.debug("save(StudentRepairOrder transientInstance) in StudentDAO");
		try {
			this.getHibernateTemplate().saveOrUpdate(transientInstance);
			log.debug("save(StudentRepairOrder transientInstance) in StudentRepairOrderDAO successful");
		} catch (RuntimeException re) {
			log.error(
					"save(StudentRepairOrder transientInstance) in StudentRepairOrderDAO failed",
					re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ilovecl.myproperty.DAO.IStudentRepairOrderDAO#delete(com.ilovecl.
	 * myproperty.model.StudentRepairOrder)
	 */
	@Override
	public void delete(StudentRepairOrder persistentInstance) {
		log.debug("delete(StudentRepairOrder persistentInstance)");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete(StudentRepairOrder persistentInstance) successful");
		} catch (RuntimeException re) {
			log.error("delete(StudentRepairOrder persistentInstance) failed",
					re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ilovecl.myproperty.DAO.IStudentRepairOrderDAO#findById(java.lang.
	 * Integer)
	 */
	@Override
	public StudentRepairOrder findById(Integer id) {
		log.debug("findById(Integer id) : " + id);
		try {
			StudentRepairOrder instance = (StudentRepairOrder) getHibernateTemplate()
					.get("com.ilovecl.myproperty.model.StudentRepairOrder", id);
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
	 * com.ilovecl.myproperty.DAO.IStudentRepairOrderDAO#findByStudentId(java
	 * .lang.Integer)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<StudentRepairOrder> findByStudentId(Integer id) {
		List<StudentRepairOrder> studentRepairOrders;
		try {
			String queryString = "from StudentRepairOrder as model where model."
					+ "studentId" + "= ?";
			studentRepairOrders = getHibernateTemplate().find(queryString, id);
		} catch (RuntimeException re) {
			log.error("findByStudentId failed", re);
			throw re;
		}

		return studentRepairOrders;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ilovecl.myproperty.DAO.IStudentRepairOrderDAO#findByRepairOrderId
	 * (java.lang.Integer)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<StudentRepairOrder> findByRepairOrderId(Integer id) {
		List<StudentRepairOrder> studentRepairOrders;
		try {
			String queryString = "from StudentRepairOrder as model where model."
					+ "repairOrderId" + "= ?";
			studentRepairOrders = getHibernateTemplate().find(queryString, id);
		} catch (RuntimeException re) {
			log.error("findByStudentId failed", re);
			throw re;
		}

		return studentRepairOrders;
	}

}
