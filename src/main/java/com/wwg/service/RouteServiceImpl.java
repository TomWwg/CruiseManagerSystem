package com.wwg.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwg.dao.RouteDao;
import com.wwg.entity.Route;
import com.wwg.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wwg on 2017/4/23.
 */
@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteDao routeDao;

    @Override
    public void insert(Route route) {
        routeDao.insert(route);
    }

    @Override
    public void deleteById(long id) {
        routeDao.deleteById(id);
    }

    @Override
    public void update(Route route) {
        routeDao.update(route);
    }

    @Override
    public Route findById(long id) {
        Route route = routeDao.findById(id);
        return route;
    }

    @Override
    public PageInfo<Route> findByStartPlaceId(long placeId, Page page) {
        List<Route> routeList = routeDao.findByStartPlaceId(placeId);
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        PageInfo<Route> routePageInfo = new PageInfo<Route>(routeList);
        return routePageInfo;
    }

    @Override
    public PageInfo<Route> findByEndPlaceId(long placeId, Page page) {
        List<Route> routeList = routeDao.findByStartPlaceId(placeId);
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        PageInfo<Route> routePageInfo = new PageInfo<Route>(routeList);
        return routePageInfo;
    }
}
