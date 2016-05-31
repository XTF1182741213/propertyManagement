/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.struts.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ������
 */
@SuppressWarnings("serial")
public class StudentRankingAction extends ActionSupport {
    int id;
    String name;
    int num;
    String firstSubmitDateStr;
    String lastSubmitDateStr;
    String repairedNum;

    public String getAllRanking() {
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
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the firstSubmitDateStr
     */
    public String getFirstSubmitDateStr() {
        return firstSubmitDateStr;
    }

    /**
     * @param firstSubmitDateStr the firstSubmitDateStr to set
     */
    public void setFirstSubmitDateStr(String firstSubmitDateStr) {
        this.firstSubmitDateStr = firstSubmitDateStr;
    }

    /**
     * @return the lastSubmitDateStr
     */
    public String getLastSubmitDateStr() {
        return lastSubmitDateStr;
    }

    /**
     * @param lastSubmitDateStr the lastSubmitDateStr to set
     */
    public void setLastSubmitDateStr(String lastSubmitDateStr) {
        this.lastSubmitDateStr = lastSubmitDateStr;
    }

    /**
     * @return the repairedNum
     */
    public String getRepairedNum() {
        return repairedNum;
    }

    /**
     * @param repairedNum the repairedNum to set
     */
    public void setRepairedNum(String repairedNum) {
        this.repairedNum = repairedNum;
    }

}
