/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.DAO;

import com.ilovecl.myproperty.model.Student;

import java.util.List;

/**
 * DAO�㣺ѧ��DAO�Ľӿ�
 *
 * @author ������
 */
public interface IStudentDAO {
    public abstract void save(Student transientInstance);

    public abstract void delete(Student persistentInstance);

    public abstract Student findById(Integer id);

    public abstract List<Student> findByUserName(String userName);

    boolean isStudentExits(String userName);

}
