package com.zhss.dao;

import com.zhss.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description:
 * @author: lixiahan
 * @create: 2019/09/19 17:53
 */
public interface IndexDao {

//    @Select("SELECT * FROM user_1 where status = 1")
    List<User> selectAll();

}

