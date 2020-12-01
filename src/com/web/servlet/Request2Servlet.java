package com.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(urlPatterns = "/request2")
public class Request2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * Enumeration getHeaderNames() 获取所有请求头的键
         * 返回Enumeration接口(向量枚举)
         * 集合：1.0-1.1 Enumeration 集合1.2 迭代器
         * Iterator迭代器接口 ： hasNext() next()
         * Enumeration接口：hasMoreElement() nextElement()
         * 
         */
        String host=request.getHeader("Host");
        System.out.println("host = " + host);

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            //通过key找value
            String headervalue = request.getHeader(s);
            System.out.println(s+" = " + headervalue);
        }
    }
}
