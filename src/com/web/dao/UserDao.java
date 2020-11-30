package com.web.dao;

import com.web.pojo.User;
import com.web.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDao {
    public User login(String username, String password) {
        QueryRunner queryRunner=new QueryRunner(DruidUtils.getDs());
        String sql="select * from user where username=? and password=? ";
        User user=null;
        Object[] paras={username,password};
        try {
            user=queryRunner.query(sql,new BeanHandler<User>(User.class),paras);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }
}
