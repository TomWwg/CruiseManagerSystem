package com.wwg.dto;

import com.wwg.entity.Evaluate;

/**
 * Created by wwg on 2017/4/21.
 */
public class EvaluateDto extends PageDto {

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

    public static Evaluate form(EvaluateDto dto){
        Evaluate evaluate = null;
        if(dto != null){
            evaluate = new Evaluate();
            evaluate.setId(dto.getId());
            evaluate.setRouteId(dto.getRouteId());
            evaluate.setUserId(dto.getUserId());
            evaluate.setContent(dto.getContent());
            evaluate.setEvaluateStatus(dto.getEvaluateStatus());
        }
        return evaluate;
    }

}
