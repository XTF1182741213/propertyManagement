/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.struts.action;

import com.ilovecl.myproperty.service.ICancelRepairOrderService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ������
 */
@SuppressWarnings("serial")
public class TestCancelRepairOrderAction extends ActionSupport {

    private ICancelRepairOrderService cancelRepairOrderService;

    /**
     * @return the cancelRepairOrderService
     */
    public ICancelRepairOrderService getCancelRepairOrderService() {
        return cancelRepairOrderService;
    }

    /**
     * @param cancelRepairOrderService the cancelRepairOrderService to set
     */
    public void setCancelRepairOrderService(
            ICancelRepairOrderService cancelRepairOrderService) {
        this.cancelRepairOrderService = cancelRepairOrderService;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    @Override
    public String execute() throws Exception {
        cancelRepairOrderService.cancel(1, "������");
        return SUCCESS;
    }
}
