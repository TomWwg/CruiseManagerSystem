package com.wwg.dao;

import com.github.pagehelper.PageInfo;
import com.wwg.entity.User;
import com.wwg.util.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by wwg on 2017/4/18 0018.
 */
public interface UserDao {

    User findByUsername(String username);

    void update(User user);

    List<User> findByUserNameLikely(String username);

    void deleteById(long id);

    void changePassword(Map<String, Object> map);

}
