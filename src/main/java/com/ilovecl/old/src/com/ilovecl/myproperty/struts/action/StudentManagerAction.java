/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.struts.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ������
 */
@SuppressWarnings("serial")
public class StudentManagerAction extends ActionSupport {
    int id;
    String name;
    String phone;
    String email;
    String sexual;

    public String getAllStudents() {
        return SUCCESS;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
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

}
