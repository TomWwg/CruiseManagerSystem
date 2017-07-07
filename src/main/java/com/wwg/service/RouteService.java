package com.wwg.service;

import com.github.pagehelper.PageInfo;
import com.wwg.entity.Route;
import com.wwg.util.Page;

/**
 * Created by wwg on 2017/4/23.
 */
public interface RouteService {

    void insert(Route route);

    void deleteById(long id);

    void update(Route route);

    Route findById(long id);

    PageInfo<Route> findByStartPlaceId(long placeId, Page page);

    PageInfo<Route> findByEndPlaceId(long placeId, Page page);

}
