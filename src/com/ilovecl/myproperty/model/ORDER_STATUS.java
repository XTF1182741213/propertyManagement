/**
 * 
 */
package com.ilovecl.myproperty.model;

/**
 * @author 邱永臣
 * 
 */
public class ORDER_STATUS {
	public static final int NEW = 0;
	public static final int WAITFORREPAIR = 1;
	public static final int REPAIRING = 2;
	public static final int REPAIRED = 3;
	public static final int CANCELED = 4;
	public static final int SIGNOFF = 5;
	public static final String[] STATUS_STR = { "新提交待查看", "已查看待安排检修", "检修中",
			"检修完毕", "被取消", "状态未知" };
}
