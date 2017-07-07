package com.wwg.entity;

import java.io.Serializable;

/**
 * Created by wwg on 2017/4/20 0020.
 */
public class Place implements Serializable {

    private static final long serialVersionUID = -8613315155733921255L;

    private long id;

    private String place;

    private String features;

    private String introduction;

    private String remark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", place='" + place + '\'' +
                ", features='" + features + '\'' +
                ", introduction='" + introduction + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
