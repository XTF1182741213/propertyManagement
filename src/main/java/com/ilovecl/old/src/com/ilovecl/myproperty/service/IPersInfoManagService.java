/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.service;

/**
 * ������Ϣ�����ҵ���߼�
 *
 * @author ������
 */
public interface IPersInfoManagService {
    boolean changeUserName(int studentId, String newUserName);

    boolean changePassword(int studentId, String newPassword);

    boolean changePhoneNumber(int studentId, long newPhoneNumber);

    boolean changeEmail(int studentId, String newEmail);

    boolean changeSexual(int studentId, String newSexual);

    /* �޸Ļ�����Ϣ������������ */
    boolean changeBasicInfo(int studentId, String newUserName,
                            long newPhoneNumber, String newEmail, String newSexual);
}
