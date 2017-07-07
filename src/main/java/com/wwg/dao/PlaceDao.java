package com.wwg.dao;

import com.wwg.entity.Place;
import com.wwg.util.Page;

import java.util.List;

/**
 * Created by wwg on 2017/4/20 0020.
 */
public interface PlaceDao {

    List<Place> findAll();

    void insert(Place place);

    void update(Place place);

    void deleteById(long id);

    List<Place> findByPlace(String place);

}
