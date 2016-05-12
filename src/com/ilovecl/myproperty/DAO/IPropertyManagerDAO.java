package com.ilovecl.myproperty.DAO;

import java.util.List;

import com.ilovecl.myproperty.model.PropertyManager;

/**
 * DAO�㣺��ҵ����ԱDAO�Ľӿ�
 * 
 * @author ������
 * 
 */
public interface IPropertyManagerDAO {
	public abstract void save(PropertyManager transientInstance);

	public abstract void delete(PropertyManager persistentInstance);

	public abstract PropertyManager findById(java.lang.Integer id);

	public abstract List<PropertyManager> findByUserName(
			java.lang.String userName);
}
