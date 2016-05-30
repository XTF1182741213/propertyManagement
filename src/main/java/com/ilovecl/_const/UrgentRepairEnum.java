package com.ilovecl._const;

/**
 * 催单状态的常量
 * Created by 邱永臣 on 2016-05-31.
 */
public enum UrgentRepairEnum {
    CHECK_WAIT(0, "CHECK_WAIT"),
    CHECK(1, "CHECK"),
    CANCELED_BY_STUDENT(2, "CANCELED_BY_STUDENT");

    private int state;
    private String stateInfo;

    UrgentRepairEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public static UrgentRepairEnum stateOf(int index) {
        for (UrgentRepairEnum state : values()) {
            if ((state.getState() == index)) {
                return state;
            }
        }

        return null;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
