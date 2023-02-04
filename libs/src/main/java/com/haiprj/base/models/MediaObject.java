package com.haiprj.base.models;

import com.haiprj.base.enums.MediaEnum;

public abstract class MediaObject {
    public MediaEnum mediaEnum;
    public int rawId;

    public MediaObject(MediaEnum mediaEnum,  int rawId) {
        this.mediaEnum = mediaEnum;
        this.rawId = rawId;
    }

    public MediaObject() {
    }

    protected void setData(){

    }
}
