/**
 * 
 */
package com.ilovecl.myproperty.service;

/**
 * 个人信息管理的业务逻辑
 * 
 * @author 邱永臣
 * 
 */
public interface IPersInfoManagService {
	boolean changeUserName(int studentId, String newUserName);

	boolean changePassword(int studentId, String newPassword);

	boolean changePhoneNumber(int studentId, long newPhoneNumber);

	boolean changeEmail(int studentId, String newEmail);

	boolean changeSexual(int studentId, String newSexual);

	/* 修改基本信息，不包括密码 */
	boolean changeBasicInfo(int studentId, String newUserName,
			long newPhoneNumber, String newEmail, String newSexual);
}
