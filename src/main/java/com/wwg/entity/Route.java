package com.wwg.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by wwg on 2017/4/23.
 */
public class Route implements Serializable {

    private static final long serialVersionUID = 7852455931560339209L;

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
        return "Route{" +
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

}
