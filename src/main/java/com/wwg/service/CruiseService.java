package com.wwg.service;

import com.github.pagehelper.PageInfo;
import com.wwg.entity.Cruise;
import com.wwg.util.Page;

import java.util.List;


/**
 * Created by wwg on 2017/4/19 0019.
 */
public interface CruiseService {

    Cruise findById(long id);

    void insert(Cruise cruise);

    void deleteById(long id);

    void update(Cruise cruise);

    PageInfo<Cruise> findAll(Page page);

    PageInfo<Cruise> findByCruiseName(String cruiseName, Page page);

    List<Cruise> findAllCruise();

}
