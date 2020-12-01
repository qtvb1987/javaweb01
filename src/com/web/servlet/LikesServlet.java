package com.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

@WebServlet(urlPatterns = "/likes")
public class LikesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //将request的缓冲区的编码修改
        request.setCharacterEncoding("utf-8");
        //接收浏览器发送过来的参数
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        System.out.println("username = " + username);
        System.out.println("pwd = " + pwd);
        //接收(一键多值情况)
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println("hobbies = " + Arrays.toString(hobbies) );
        //接收所有参数信息
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (Map.Entry<String, String[]> entry:parameterMap.entrySet()
             ) {
            String key = entry.getKey();
            String[] value = entry.getValue();
            System.out.println(key+" = " +Arrays.toString(value) );
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
