package com.wwg.dto;

import com.wwg.entity.Cruise;

import java.io.Serializable;

/**
 * Created by wwg on 2017/4/19 0019.
 */
public class CruiseDto extends PageDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    private String cruiseName;

    private String roomNumber;

    private String cruiseLevel;

    private String remark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCruiseName() {
        return cruiseName;
    }

    public void setCruiseName(String cruiseName) {
        this.cruiseName = cruiseName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCruiseLevel() {
        return cruiseLevel;
    }

    public void setCruiseLevel(String cruiseLevel) {
        this.cruiseLevel = cruiseLevel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Cruise{" +
                "id=" + id +
                ", cruiseName='" + cruiseName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", cruiseLevel='" + cruiseLevel + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public static Cruise form(CruiseDto dto){
        Cruise cruise = null;
        if(dto != null){
            cruise = new Cruise();
            cruise.setId(dto.getId());
            cruise.setCruiseLevel(dto.getCruiseLevel());
            cruise.setCruiseName(dto.getCruiseName());
            cruise.setRoomNumber(dto.getRoomNumber());
            cruise.setRemark(dto.getRemark());
        }
        return cruise;
    }
}
