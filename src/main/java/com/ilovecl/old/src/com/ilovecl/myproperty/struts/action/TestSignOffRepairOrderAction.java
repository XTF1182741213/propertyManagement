/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.struts.action;

import com.ilovecl.myproperty.service.ISignOffRepairOrderService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ������
 */
@SuppressWarnings("serial")
public class TestSignOffRepairOrderAction extends ActionSupport {
    private ISignOffRepairOrderService signOffRepairOrderService;

    /**
     * @return the signOffRepairOrderService
     */
    public ISignOffRepairOrderService getSignOffRepairOrderService() {
        return signOffRepairOrderService;
    }

    /**
     * @param signOffRepairOrderService the signOffRepairOrderService to set
     */
    public void setSignOffRepairOrderService(
            ISignOffRepairOrderService signOffRepairOrderService) {
        this.signOffRepairOrderService = signOffRepairOrderService;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    @Override
    public String execute() throws Exception {
        if (signOffRepairOrderService.signOff(1, "������"))
            return SUCCESS;
        else {
            return INPUT;
        }
    }

}
