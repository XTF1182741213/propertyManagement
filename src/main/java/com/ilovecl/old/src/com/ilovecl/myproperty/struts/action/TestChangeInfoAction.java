/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.struts.action;

import com.ilovecl.myproperty.service.IPersInfoManagService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ������
 */
@SuppressWarnings("serial")
public class TestChangeInfoAction extends ActionSupport {

    private IPersInfoManagService persInfoManagService;

    /*
     * (non-Javadoc)
     *
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    @Override
    public String execute() throws Exception {
        persInfoManagService.changeBasicInfo(1, "��������", 15622154344l,
                "�������ǵ�����", "Ů");
        return super.execute();
    }

    /**
     * @return the persInfoManagService
     */
    public IPersInfoManagService getPersInfoManagService() {
        return persInfoManagService;
    }

    /**
     * @param persInfoManagService the persInfoManagService to set
     */
    public void setPersInfoManagService(
            IPersInfoManagService persInfoManagService) {
        this.persInfoManagService = persInfoManagService;
    }

}
