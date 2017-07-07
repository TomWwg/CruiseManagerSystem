package com.wwg.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwg.dao.PlaceDao;
import com.wwg.entity.Place;
import com.wwg.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/4/20.
 */
@Service
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private PlaceDao placeDao;

    @Override
    public PageInfo<Place> findAll(Page page) {
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        List<Place> placeList = placeDao.findAll();
        PageInfo<Place> pageInfo = new PageInfo<Place>(placeList);
        return pageInfo;
    }

    @Override
    public void insert(Place place) {
        placeDao.insert(place);
    }

    @Override
    public void update(Place place) {
        placeDao.update(place);
    }

    @Override
    public void deleteById(long id) {
        placeDao.deleteById(id);
    }

    @Override
    public PageInfo<Place> findByPlace(String place, Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Place> placeList = placeDao.findByPlace(place);
        PageInfo<Place> pageInfo = new PageInfo<Place>(placeList);
        return pageInfo;
    }
}
