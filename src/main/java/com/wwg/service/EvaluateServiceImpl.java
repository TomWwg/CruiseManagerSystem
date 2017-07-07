package com.wwg.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwg.dao.EvaluateDao;
import com.wwg.entity.Evaluate;
import com.wwg.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wwg on 2017/4/22.
 */
@Service
public class EvaluateServiceImpl implements EvaluateService {

    @Autowired
    private EvaluateDao evaluateDao;

    @Override
    public void insert(Evaluate evaluate) {
        evaluateDao.insert(evaluate);
    }

    @Override
    public void deleteById(long id) {
        evaluateDao.deleteById(id);
    }

    @Override
    public void update(Evaluate evaluate) {
        evaluateDao.update(evaluate);
    }

    @Override
    public PageInfo<Evaluate> findByUserId(long userId, Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Evaluate> evaluateList = evaluateDao.findByUserId(userId);
        PageInfo<Evaluate> evaluatePageInfo = new PageInfo<Evaluate>(evaluateList);
        return evaluatePageInfo;
    }

    @Override
    public PageInfo<Evaluate> findByRouteId(long routeId, Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Evaluate> evaluateList = evaluateDao.findByRouteId(routeId);
        PageInfo<Evaluate> evaluatePageInfo = new PageInfo<Evaluate>(evaluateList);
        return evaluatePageInfo;
    }

    @Override
    public PageInfo<Evaluate> findAll(Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<Evaluate> evaluateList = evaluateDao.findAll();
        PageInfo<Evaluate> evaluatePageInfo = new PageInfo<Evaluate>(evaluateList);
        return evaluatePageInfo;
    }
}
