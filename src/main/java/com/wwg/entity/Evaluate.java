package com.wwg.entity;

/**
 * Created by wwg on 2017/4/21.
 */

import java.io.Serializable;

/**
 * 用户评价的实体类
 */
public class Evaluate implements Serializable {

    private static final long serialVersionUID = 3064914840035825924L;

    private long id;

    //航线的Id
    private long routeId;

    private long userId;

    //评价内容
    private String content;

    //评价的状态
    private String evaluateStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRouteId() {
        return routeId;
    }

    public void setRouteId(long routeId) {
        this.routeId = routeId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEvaluateStatus() {
        return evaluateStatus;
    }

    public void setEvaluateStatus(String evaluateStatus) {
        this.evaluateStatus = evaluateStatus;
    }

    @Override
    public String toString() {
        return "EvaluateDto{" +
                "id=" + id +
                ", routeId=" + routeId +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", evaluateStatus='" + evaluateStatus + '\'' +
                '}';
    }

}
