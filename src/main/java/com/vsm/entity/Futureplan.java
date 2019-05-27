package com.vsm.entity;

import java.io.Serializable;

public class Futureplan implements Serializable {

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    private int fid;

    private int f_userid;

    private String fcontent;

    private String ftime;

    public String getFcontent() {
        return fcontent;
    }

    public void setFcontent(String fcontent) {
        this.fcontent = fcontent;
    }

    public String getFtime() {
        return ftime;
    }

    public void setFtime(String ftime) {
        this.ftime = ftime;
    }


    public int getF_userid() {
        return f_userid;
    }

    public void setF_userid(int f_userid) {
        this.f_userid = f_userid;
    }


}
