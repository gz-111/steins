package com.guanhuan.base.user.inter;

import com.guanhuan.base.user.entity.User;

/**
 * @author
 * @create 2017-11-10 17:38
 **/
public interface UserService {

    void add(User user);

    void delete(User user);

    void update(User user);

    boolean isExist(String account);

    User findByAccount(String account);

    User findById(long userId);
}