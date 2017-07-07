package com.wwg.dao;

import com.wwg.entity.Room;

import java.util.List;

/**
 * Created by Administrator on 2017/4/21 0021.
 */
public interface RoomDao {

    List<Room> findAll();

    void insert(Room room);

    void deleteById(long id);

    void update(Room room);

    List<Room> findByCruiseId(long cruiseid);

}
