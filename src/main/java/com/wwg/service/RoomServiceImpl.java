package com.wwg.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwg.dao.RoomDao;
import com.wwg.entity.Room;
import com.wwg.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wwg on 2017/4/21 0021.
 */
@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomDao roomDao;

    @Override
    public PageInfo<Room> findAll(Page page) {
        List<Room> roomList = roomDao.findAll();
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        PageInfo<Room> roomPageInfo = new PageInfo<Room>(roomList);
        return roomPageInfo;
    }

    @Override
    public void insert(Room room) {
        roomDao.insert(room);
    }

    @Override
    public void deleteById(long id) {
        roomDao.deleteById(id);
    }

    @Override
    public void update(Room room) {
        roomDao.update(room);
    }

    @Override
    public PageInfo<Room> findByCruiseId(long cruiseId, Page page) {
        List<Room> roomList = roomDao.findByCruiseId(cruiseId);
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        PageInfo<Room> roomPageInfo = new PageInfo<Room>(roomList);
        return roomPageInfo;
    }
}
