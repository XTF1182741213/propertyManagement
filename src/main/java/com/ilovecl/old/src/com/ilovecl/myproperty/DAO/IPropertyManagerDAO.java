package com.ilovecl.old.src.com.ilovecl.myproperty.DAO;

import com.ilovecl.myproperty.model.PropertyManager;

import java.util.List;

/**
 * DAO�㣺��ҵ����ԱDAO�Ľӿ�
 *
 * @author ������
 */
public interface IPropertyManagerDAO {
    public abstract void save(PropertyManager transientInstance);

    public abstract void delete(PropertyManager persistentInstance);

    public abstract PropertyManager findById(Integer id);

    public abstract List<PropertyManager> findByUserName(
            String userName);
}
