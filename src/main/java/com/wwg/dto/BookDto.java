package com.wwg.dto;

import com.wwg.entity.Book;

/**
 * Created by wwg on 2017/4/24 0024.
 */
public class BookDto extends PageDto {

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
        return "BookDto{" +
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

    public static Book form(BookDto dto){
        Book book = null;
        if(dto != null){
            book = new Book();
            book.setId(dto.getId());
            book.setUserId(dto.getUserId());
            book.setRouteId(dto.getRouteId());
            book.setCruiseid(dto.getCruiseid());
            book.setDipositAmount(dto.getDipositAmount());
            book.setDipositStatus(dto.getDipositStatus());
            book.setRoomId(dto.getRoomId());
            book.setStatus(dto.getStatus());
        }
        return book;
    }

}
