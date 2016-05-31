/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.service;

import com.ilovecl.myproperty.DAO.IStudentDAO;
import com.ilovecl.myproperty.model.Student;

/**
 * @author ������
 */
public interface IRegisterService {

    public IStudentDAO getStudentDAO();

    public void setStudentDAO(IStudentDAO studentDAO);

    public boolean register(Student student);

    boolean isStudentExits(String userName);
}
