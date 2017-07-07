package com.wwg.entity;

import java.io.Serializable;

/**
 * Created by wwg on 2017/4/21 0021.
 */
public class Room implements Serializable {

    private static final long serialVersionUID = 2850032436679406513L;

    private String cruiseName;

    public String getCruiseName() {
        return cruiseName;
    }

    public void setCruiseName(String cruiseName) {
        this.cruiseName = cruiseName;
    }

    private long id;

    private long cruiseId;

    private String roomNumber;

    private String roomLevel;

    private String roomPrice;

    private String roomStatus;

    private String remark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCruiseId() {
        return cruiseId;
    }

    public void setCruiseId(long cruiseId) {
        this.cruiseId = cruiseId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomLevel() {
        return roomLevel;
    }

    public void setRoomLevel(String roomLevel) {
        this.roomLevel = roomLevel;
    }

    public String getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(String roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", cruiseId=" + cruiseId +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomLevel='" + roomLevel + '\'' +
                ", roomPrice='" + roomPrice + '\'' +
                ", roomStatus='" + roomStatus + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
