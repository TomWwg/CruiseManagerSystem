package com.wwg.service;

import com.github.pagehelper.PageInfo;
import com.wwg.entity.User;
import com.wwg.util.Page;

/**
 * Created by wwg on 2017/4/18 0018.
 */
public interface UserService {

    User findByUsername(String username);

    void update(User user);

    PageInfo<User> findByUserNameLikely(String username, Page page);

    void deleteById(long id);

    void changePassword(long id, String password);
}
