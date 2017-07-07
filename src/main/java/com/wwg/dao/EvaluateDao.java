package com.wwg.dao;

import com.wwg.entity.Evaluate;

import java.util.List;

/**
 * Created by wwg on 2017/4/21.
 */
public interface EvaluateDao {

    void insert(Evaluate evaluate);

    void deleteById(long id);

    void update(Evaluate evaluate);

    List<Evaluate> findByUserId(long userId);

    List<Evaluate> findByRouteId(long routeId);

    List<Evaluate> findAll();

}
