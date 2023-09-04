package com.use.mapper;

import com.use.entity.User;

public interface UserMapper {

    User selectById(Integer id);

    void updateForName(String id,String username);
}
