/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.struts.action;

import com.ilovecl.myproperty.service.IRemindRepairOrderService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author DELL
 */
@SuppressWarnings("serial")
public class TestLookRemindRepairOrderAction extends ActionSupport {

    private IRemindRepairOrderService remindRepairOrderService;

    /**
     * @return the remindRepairOrderService
     */
    public IRemindRepairOrderService getRemindRepairOrderService() {
        return remindRepairOrderService;
    }

    /**
     * @param remindRepairOrderService the remindRepairOrderService to set
     */
    public void setRemindRepairOrderService(
            IRemindRepairOrderService remindRepairOrderService) {
        this.remindRepairOrderService = remindRepairOrderService;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    @Override
    public String execute() throws Exception {
        remindRepairOrderService.lookRemindRepairOrder(1);
        return super.execute();
    }
}
