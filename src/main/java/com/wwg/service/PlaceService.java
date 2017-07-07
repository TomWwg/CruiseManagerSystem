package com.wwg.service;

import com.github.pagehelper.PageInfo;
import com.wwg.entity.Place;
import com.wwg.util.Page;

/**
 * Created by wwg on 2017/4/20 0020.
 */
public interface PlaceService {

    PageInfo<Place> findAll(Page page);

    void insert(Place place);

    void update(Place place);

    void deleteById(long id);

    PageInfo<Place> findByPlace(String place, Page page);

}
