/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.service;

import com.ilovecl.myproperty.DAO.impl.PropertyManagerDAO;
import com.ilovecl.myproperty.DAO.impl.StudentDAO;

/**
 * @author ������
 */
public interface ILoginService {
    public StudentDAO getStudentDAO();

    public void setStudentDAO(StudentDAO studentDAO);

    public PropertyManagerDAO getPropertyManagerDAO();

    public void setPropertyManagerDAO(PropertyManagerDAO propertyManagerDAO);

    public boolean studentLogin(String userName, String password);

    boolean isStudentExits(String userName);

    public boolean propertyManagerLogin(String userName, String password);

    boolean isPropertyManagerExits(String userName);
}
