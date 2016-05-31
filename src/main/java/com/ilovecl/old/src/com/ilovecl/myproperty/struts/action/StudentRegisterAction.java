/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.struts.action;

import com.ilovecl.myproperty.model.Student;
import com.ilovecl.myproperty.service.IRegisterService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * �û�ע�Ṧ�ܵ�Action��
 *
 * @author ������
 */
@SuppressWarnings("serial")
public class StudentRegisterAction extends ActionSupport {
    String message;
    private int userId;
    private String userName;
    private String password;
    private String passwordConfirm;
    private long phoneNumber;
    private String email;
    private String sexual;
    private IRegisterService iRegisterService;

    /**
     *
     */
    public StudentRegisterAction() {
        phoneNumber = 0;
        email = "";
        sexual = "";
    }

    /*
     * (non-Javadoc)
     *
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    @Override
    public String execute() throws Exception {
        this.message = "";

        if (this.userName.equals("")) {
            this.message += "�û���Ϊ�գ�\n";
            return INPUT;
        } else if (this.password.equals("") || this.passwordConfirm.equals("")) {
            this.message += "����Ϊ�գ�\n";
            return INPUT;
        } else if (!this.password.equals(this.passwordConfirm)) {
            this.message += "�������벻��ͬ��\n";
            return INPUT;
        }

        if (iRegisterService.isStudentExits(userName)) {
            this.message += "�˻��Ѵ��ڣ�";
            return INPUT;
        }
        if (iRegisterService.register(new Student(userName, password,
                phoneNumber, email, sexual))) {
            this.message = "ע��ɹ�";
            return SUCCESS;
        } else {
            this.message = "ע��ʧ��";
            return INPUT;
        }
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the passwordConfirm
     */
    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    /**
     * @param passwordConfirm the passwordConfirm to set
     */
    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    /**
     * @return the phoneNumber
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the sexual
     */
    public String getSexual() {
        return sexual;
    }

    /**
     * @param sexual the sexual to set
     */
    public void setSexual(String sexual) {
        this.sexual = sexual;
    }

    /**
     * @return the iRegisterService
     */
    public IRegisterService getiRegisterService() {
        return iRegisterService;
    }

    /**
     * @param iRegisterService the iRegisterService to set
     */
    public void setiRegisterService(IRegisterService iRegisterService) {
        this.iRegisterService = iRegisterService;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
