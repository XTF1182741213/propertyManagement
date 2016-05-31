/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.DAO;

import com.ilovecl.myproperty.model.StudentRepairOrder;

import java.util.List;

/**
 * DAO�㣺ѧ���ͱ��޵���ӦDAO�Ľӿ�
 *
 * @author ������
 */
public interface IStudentRepairOrderDAO {
    public abstract void save(StudentRepairOrder transientInstance);

    public abstract void delete(StudentRepairOrder persistentInstance);

    public abstract StudentRepairOrder findById(Integer id);

    public abstract List<StudentRepairOrder> findByStudentId(
            Integer id);

    public abstract List<StudentRepairOrder> findByRepairOrderId(
            Integer id);
}
