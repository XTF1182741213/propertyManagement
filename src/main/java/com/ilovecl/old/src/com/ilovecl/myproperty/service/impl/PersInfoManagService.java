/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.service.impl;

import com.ilovecl.myproperty.DAO.impl.StudentDAO;
import com.ilovecl.myproperty.model.Student;
import com.ilovecl.myproperty.service.IPersInfoManagService;

/**
 * ������Ϣ�����ҵ���߼�
 *
 * @author ������
 */
public class PersInfoManagService implements IPersInfoManagService {
    private StudentDAO studentDAO;

    @Override
    public boolean changeUserName(int studentId, String newUserName) {
        Student student = studentDAO.findById(studentId);
        student.setUserName(newUserName);
        studentDAO.save(student);
        return true;
    }

    @Override
    public boolean changePassword(int studentId, String newPassword) {
        Student student = studentDAO.findById(studentId);
        student.setPassword(newPassword);
        studentDAO.save(student);
        return true;
    }

    @Override
    public boolean changePhoneNumber(int studentId, long newPhoneNumber) {
        Student student = studentDAO.findById(studentId);
        student.setPhoneNumber(newPhoneNumber);
        studentDAO.save(student);
        return true;
    }

    @Override
    public boolean changeEmail(int studentId, String newEmail) {
        Student student = studentDAO.findById(studentId);
        student.setEmail(newEmail);
        studentDAO.save(student);
        return true;
    }

    @Override
    public boolean changeSexual(int studentId, String newSexual) {
        Student student = studentDAO.findById(studentId);
        student.setSexual(newSexual);
        studentDAO.save(student);
        return true;
    }

    @Override
    public boolean changeBasicInfo(int studentId, String newUserName,
                                   long newPhoneNumber, String newEmail, String newSexual) {
        Student student = studentDAO.findById(studentId);
        student.setUserName(newUserName);
        student.setPhoneNumber(newPhoneNumber);
        student.setEmail(newEmail);
        student.setSexual(newSexual);
        studentDAO.save(student);
        return true;
    }

    /**
     * @return the studentDAO
     */
    public StudentDAO getStudentDAO() {
        return studentDAO;
    }

    /**
     * @param studentDAO the studentDAO to set
     */
    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

}
