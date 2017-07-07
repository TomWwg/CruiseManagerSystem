package com.wwg.dto;

import com.wwg.entity.Room;

/**
 * Created by Administrator on 2017/4/21 0021.
 */
public class RoomDto extends PageDto {

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

    public static Room form(RoomDto dto){
        Room room = null;
        if(dto != null){
            room = new Room();
            room.setId(dto.getId());
            room.setCruiseId(dto.getCruiseId());
            room.setRoomNumber(dto.getRoomNumber());
            room.setRoomLevel(dto.getRoomLevel());
            room.setRoomPrice(dto.getRoomPrice());
            room.setRoomStatus(dto.getRoomStatus());
        }
        return room;
    }

}
