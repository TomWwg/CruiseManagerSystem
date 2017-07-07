package com.wwg.entity;

import java.io.Serializable;

/**
 * Created by wwg on 2017/4/24 0024.
 */
public class Book implements Serializable {

    private static final long serialVersionUID = 9148114274839213993L;

    private long id;

    private long userId;

    private String dipositAmount;

    private String dipositStatus;

    private long cruiseid;

    private long routeId;

    private long roomId;

    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDipositAmount() {
        return dipositAmount;
    }

    public void setDipositAmount(String dipositAmount) {
        this.dipositAmount = dipositAmount;
    }

    public String getDipositStatus() {
        return dipositStatus;
    }

    public void setDipositStatus(String dipositStatus) {
        this.dipositStatus = dipositStatus;
    }

    public long getCruiseid() {
        return cruiseid;
    }

    public void setCruiseid(long cruiseid) {
        this.cruiseid = cruiseid;
    }

    public long getRouteId() {
        return routeId;
    }

    public void setRouteId(long routeId) {
        this.routeId = routeId;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", userId=" + userId +
                ", dipositAmount='" + dipositAmount + '\'' +
                ", dipositStatus='" + dipositStatus + '\'' +
                ", cruiseid=" + cruiseid +
                ", routeId=" + routeId +
                ", roomId=" + roomId +
                ", status='" + status + '\'' +
                '}';
    }

}
