package com.vsm.entity;

import java.io.Serializable;
import java.util.Date;

public class Conclusion implements Serializable {

    private int id;

    private int c_userid;


    private String content;

    private Date time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getC_userid() {
        return c_userid;
    }

    public void setC_userid(int c_userid) {
        this.c_userid = c_userid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
