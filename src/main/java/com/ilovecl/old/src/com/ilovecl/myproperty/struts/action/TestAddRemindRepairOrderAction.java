/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.struts.action;

import com.ilovecl.myproperty.model.RemindRepairOrder;
import com.ilovecl.myproperty.service.IRemindRepairOrderService;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.Date;

/**
 * @author ������
 */
@SuppressWarnings("serial")
public class TestAddRemindRepairOrderAction extends ActionSupport {

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
        java.util.Date date = new java.util.Date();
        remindRepairOrderService.addRemindRepairOrder(new RemindRepairOrder(1,
                new Date(date.getTime())));
        return super.execute();
    }
}
