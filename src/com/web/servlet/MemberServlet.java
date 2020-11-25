package com.web.servlet;

import com.web.pojo.Member;
import com.web.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class MemberServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String uname=request.getParameter("uname");
        String pwd=request.getParameter("pwd");
        //获取QueryRunner对象
        QueryRunner queryRunner=new QueryRunner(DruidUtils.getDs());
        //指定sql
        String sql="select * from member where uname=? and pwd=?  ";
        Object[] arrs={uname,pwd};
        try {
            Member model = queryRunner.query(sql, new BeanHandler<>(Member.class), arrs);
            if(model!=null){
                System.out.println("登录成功");
                response.setContentType("text/html;charset=UTF-8");
                response.getWriter().print("登录成功");
            }else {

                System.out.println("登录失败");
                response.setContentType("text/html;charset=UTF-8");
                response.getWriter().print("登录失败");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("get");
    }
}
