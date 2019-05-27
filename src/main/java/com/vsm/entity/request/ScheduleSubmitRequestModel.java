package com.vsm.entity.request;

import java.io.Serializable;
import java.util.Date;

public class ScheduleSubmitRequestModel implements Serializable {


    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    private int state;

}
