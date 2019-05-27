package com.vsm.entity.request;

import java.io.Serializable;
import java.util.Date;

public class ScheduleSelectRequestModel implements Serializable {


    private Date time;


    private int s_userid;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getS_userid() {
        return s_userid;
    }

    public void setS_userid(int s_userid) {
        this.s_userid = s_userid;
    }
}
