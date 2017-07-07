package com.wwg.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwg.dao.CruiseDao;
import com.wwg.entity.Cruise;
import com.wwg.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wwg on 2017/4/19 0019.
 */
@Service
public class CruiseServiceImpl implements CruiseService {

    @Autowired
    private CruiseDao cruiseDao;

    @Override
    public Cruise findById(long id) {
        return cruiseDao.findById(id);
    }

    @Override
    public void insert(Cruise cruise) {
        cruiseDao.insert(cruise);
    }

    @Override
    public void deleteById(long id) {
        cruiseDao.deleteById(id);
    }

    @Override
    public void update(Cruise cruise) {
        cruiseDao.update(cruise);
    }

    @Override
    public PageInfo<Cruise> findAll(Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Cruise> cruiseList = cruiseDao.findAll();
        PageInfo<Cruise> pageInfo = new PageInfo<Cruise>(cruiseList);
        return pageInfo;
    }

    @Override
    public PageInfo<Cruise> findByCruiseName(String cruiseName, Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Cruise> cruiseList = cruiseDao.findByCruiseName(cruiseName);
        PageInfo<Cruise> pageInfo = new PageInfo<Cruise>(cruiseList);
        return pageInfo;
    }

    @Override
    public List<Cruise> findAllCruise() {
        List<Cruise> cruiseList = cruiseDao.findAll();
        return cruiseList;
    }
}
