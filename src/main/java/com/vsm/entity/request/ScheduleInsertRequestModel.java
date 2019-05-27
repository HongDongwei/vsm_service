package com.vsm.entity.request;

import java.io.Serializable;
import java.util.Date;

public class ScheduleInsertRequestModel implements Serializable {


    private int status;

    private Date time;

    private String place;

    private String thing;

    private String cycle;

    private int degree;

    private String label;

    private int isremind;

    private String type;

    private int state;

    private Date startdate;

    private Date enddate;

    private int s_userid;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getIsremind() {
        return isremind;
    }

    public void setIsremind(int isremind) {
        this.isremind = isremind;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public int getS_userid() {
        return s_userid;
    }

    public void setS_userid(int s_userid) {
        this.s_userid = s_userid;
    }
}
