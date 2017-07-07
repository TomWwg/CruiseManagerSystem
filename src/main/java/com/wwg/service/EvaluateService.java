package com.wwg.service;

import com.github.pagehelper.PageInfo;
import com.wwg.entity.Evaluate;
import com.wwg.util.Page;

/**
 * Created by admin on 2017/4/21.
 */
public interface EvaluateService {

    void insert(Evaluate evaluate);

    void deleteById(long id);

    void update(Evaluate evaluate);

    PageInfo<Evaluate> findByUserId(long userId, Page page);

    PageInfo<Evaluate> findByRouteId(long routeId, Page page);

    PageInfo<Evaluate> findAll(Page page);

}
