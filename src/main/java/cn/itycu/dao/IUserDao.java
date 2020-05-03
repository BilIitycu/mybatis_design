package cn.itycu.dao;

import cn.itycu.domain.User;
import cn.itycu.mybatis.annotations.Select;

import java.util.List;

/**
 * @author 披风少年
 * @version 1.0
 * @date 2020/5/3 14:31
 *
 * 用户持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}
