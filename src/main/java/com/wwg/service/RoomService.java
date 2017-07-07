package com.wwg.service;

import com.github.pagehelper.PageInfo;
import com.wwg.entity.Room;
import com.wwg.util.Page;

/**
 * Created by wwg on 2017/4/21 0021.
 */
public interface RoomService {

    PageInfo<Room> findAll(Page page);

    void insert(Room room);

    void deleteById(long id);

    void update(Room room);

    PageInfo<Room> findByCruiseId(long cruiseId, Page page);

}
