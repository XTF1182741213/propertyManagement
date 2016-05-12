/**
 * 
 */
package com.ilovecl.myproperty.DAO.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ilovecl.myproperty.DAO.IPropertyManagerDAO;
import com.ilovecl.myproperty.model.PropertyManager;

/**
 * @author «Ò”¿≥º
 * 
 */
public class PropertyManagerDAO extends HibernateDaoSupport implements
		IPropertyManagerDAO {

	private static final Log log = LogFactory.getLog(PropertyManagerDAO.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ilovecl.myproperty.DAO.IPropertyManagerDAO#save(com.ilovecl.myproperty
	 * .model.PropertyManager)
	 */
	@Override
	public void save(PropertyManager transientInstance) {
		log.debug("save(PropertyManager transientInstance) in PropertyManagerDAO");
		try {
			this.getHibernateTemplate().saveOrUpdate(transientInstance);
			log.debug("save(PropertyManager transientInstance) in PropertyManagerDAO successful");
		} catch (RuntimeException re) {
			log.error(
					"save(PropertyManager transientInstance) in PropertyManagerDAO failed",
					re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ilovecl.myproperty.DAO.IPropertyManagerDAO#delete(com.ilovecl.myproperty
	 * .model.PropertyManager)
	 */
	@Override
	public void delete(PropertyManager persistentInstance) {
		log.debug("delete(PropertyManager persistentInstance)");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete(PropertyManager persistentInstance) successful");
		} catch (RuntimeException re) {
			log.error("delete(PropertyManager persistentInstance) failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ilovecl.myproperty.DAO.IPropertyManagerDAO#findById(java.lang.Integer
	 * )
	 */
	@Override
	public PropertyManager findById(Integer id) {
		log.debug("findById(Integer id) : " + id);
		try {
			PropertyManager instance = (PropertyManager) getHibernateTemplate()
					.get("com.ilovecl.myproperty.model.PropertyManager", id);
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
	 * com.ilovecl.myproperty.DAO.IPropertyManagerDAO#findByUserName(java.lang
	 * .String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PropertyManager> findByUserName(String userName) {
		List<PropertyManager> propertyManagers;
		try {
			String queryString = "from PropertyManager as model where model."
					+ "userName" + "= ?";
			propertyManagers = (List<PropertyManager>) getHibernateTemplate()
					.find(queryString, userName);
		} catch (RuntimeException re) {
			log.error("findByUserName failed", re);
			throw re;
		}

		return propertyManagers;
	}

}
