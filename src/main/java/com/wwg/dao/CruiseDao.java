package com.wwg.dao;

import com.wwg.entity.Cruise;

import java.util.List;

/**
 * Created by wwg on 2017/4/19 0019.
 */
public interface CruiseDao {

    Cruise findById(long id);

    void insert(Cruise cruise);

    void deleteById(long id);

    void update(Cruise cruise);

    List<Cruise> findAll();

    List<Cruise> findByCruiseName(String CruiseName);

}
