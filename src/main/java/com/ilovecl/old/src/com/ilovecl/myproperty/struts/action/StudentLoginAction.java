/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.struts.action;

import com.ilovecl.myproperty.service.ILoginService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * �û���¼���ܵ�Action��
 *
 * @author ������
 */
@SuppressWarnings("serial")
public class StudentLoginAction extends ActionSupport {
    private String userName;
    private String password;
    private String message;

    private ILoginService loginService;

    public String login() throws IOException {
        HttpServletResponse resp = ServletActionContext.getResponse();
        resp.setHeader("pragma", "no-cache");
        resp.setHeader("cache-control", "no-cache");
        PrintWriter out = resp.getWriter();
        if (loginService.studentLogin(userName, password)) {
            out.print(0);

        } else {
            out.print(1);
        }
        out.flush();
        return NONE;
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
        } else if (this.password.equals("")) {
            this.message += "����Ϊ�գ�\n";
            return INPUT;
        }

        if (!loginService.isStudentExits(userName)) {
            this.message += "�˻������ڣ�";
            return INPUT;
        }

        if (loginService.studentLogin(userName, password)) {
            this.message = "��¼�ɹ�";
            return SUCCESS;
        } else {
            this.message = "ע��ʧ��";
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
