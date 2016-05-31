/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.struts.action;

import com.ilovecl.myproperty.service.ILoginService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ��ҵ����Ա��¼���ܵ�Action��
 *
 * @author ������
 */
@SuppressWarnings("serial")
public class PropertyManagerLoginAction extends ActionSupport {
    private String userName;
    private String password;
    private String message;

    private ILoginService loginService;

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
        } else if (this.password.equals("")) {
            this.message += "����Ϊ�գ�\n";
            return INPUT;
        }

        if (!loginService.isPropertyManagerExits(userName)) {
            this.message += "��ҵ����Ա�˻������ڣ�";
            return INPUT;
        }

        if (loginService.propertyManagerLogin(userName, password)) {
            this.message = "��ҵ����Ա��¼�ɹ�";
            return SUCCESS;
        } else {
            this.message = "��ҵ����Ա��¼ʧ��";
            return INPUT;
        }

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

    /**
     * @return the loginService
     */
    public ILoginService getLoginService() {
        return loginService;
    }

    /**
     * @param loginService the loginService to set
     */
    public void setLoginService(ILoginService loginService) {
        this.loginService = loginService;
    }

}
