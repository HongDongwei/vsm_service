package com.vsm.entity.request;

import java.io.Serializable;

public class ConclusionSubmitRequestModel implements Serializable {


    private int id;

    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
