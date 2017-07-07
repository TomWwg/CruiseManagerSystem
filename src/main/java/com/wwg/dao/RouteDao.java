package com.wwg.dao;

import com.wwg.entity.Route;

import java.util.List;

/**
 * Created by admin on 2017/4/23.
 */
public interface RouteDao {

    void insert(Route route);

    void deleteById(long id);

    void update(Route route);

    Route findById(long id);

    List<Route> findByStartPlaceId(long placeId);

    List<Route> findByEndPlaceId(long placeId);

}
