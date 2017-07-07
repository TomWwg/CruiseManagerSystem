package com.wwg.dto;

import com.wwg.entity.Route;

import java.sql.Timestamp;


/**
 * Created by wwg on 2017/4/23.
 */
public class RouteDto extends PageDto {

    private long id;

    private long startPlaceId;

    private long endPlaceId;

    private Timestamp time;

    private String cruiseName;

    private String travelDays;

    private String price;

    private String currentPrice;

    private String discount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStartPlaceId() {
        return startPlaceId;
    }

    public void setStartPlaceId(long startPlaceId) {
        this.startPlaceId = startPlaceId;
    }

    public long getEndPlaceId() {
        return endPlaceId;
    }

    public void setEndPlaceId(long endPlaceId) {
        this.endPlaceId = endPlaceId;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getCruiseName() {
        return cruiseName;
    }

    public void setCruiseName(String cruiseName) {
        this.cruiseName = cruiseName;
    }

    public String getTravelDays() {
        return travelDays;
    }

    public void setTravelDays(String travelDays) {
        this.travelDays = travelDays;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "RouteDto{" +
                "id=" + id +
                ", startPlaceId=" + startPlaceId +
                ", endPlaceId=" + endPlaceId +
                ", time=" + time +
                ", cruiseName='" + cruiseName + '\'' +
                ", travelDays='" + travelDays + '\'' +
                ", price='" + price + '\'' +
                ", currentPrice='" + currentPrice + '\'' +
                ", discount='" + discount + '\'' +
                '}';
    }

    public static Route form(RouteDto dto){
        Route route = null;
        if(dto != null){
            route = new Route();
            route.setId(dto.getId());
            route.setCruiseName(dto.getCruiseName());
            route.setCurrentPrice(dto.getCurrentPrice());
            route.setDiscount(dto.getDiscount());
            route.setEndPlaceId(dto.getEndPlaceId());
            route.setPrice(dto.getPrice());
            route.setStartPlaceId(dto.getStartPlaceId());
            route.setTime(dto.getTime());
            route.setTravelDays(dto.getTravelDays());
        }
        return route;
    }

}
