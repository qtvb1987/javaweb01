package com.web.service;

import com.web.dao.UserDao;
import com.web.pojo.User;
import com.web.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserService {
    public User login(String username, String password) {
        UserDao userDao=new UserDao();
        return userDao.login(username,password);



    }
}
