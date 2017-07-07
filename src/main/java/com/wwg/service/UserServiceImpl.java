package com.wwg.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wwg.dao.UserDao;
import com.wwg.entity.User;
import com.wwg.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by wwg on 2017/4/18 0018.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public PageInfo<User> findByUserNameLikely(String username, Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<User> userList = userDao.findByUserNameLikely(username);
        PageInfo<User> pageInfo = new PageInfo<User>(userList);
        return pageInfo;
    }

    @Override
    public void deleteById(long id) {
        userDao.deleteById(id);
    }

    @Override
    public void changePassword(long id, String password) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id",id);
        map.put("password", password);
        userDao.changePassword(map);
    }
}
