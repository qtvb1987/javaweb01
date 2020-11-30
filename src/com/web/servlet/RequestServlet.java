package com.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/request1")
public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request对象方法getMethod()获取客户端的请求方式
        String method=request.getMethod();
        System.out.println(method);
        //方法String getRequestURI() 获取请求服务器路径
        //方法StringBuffer getRequestURL() 获取请求服务器路径
        String URI =request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("URI = " + URI); //  /request1
        System.out.println("requestURL = " + requestURL); // http://localhost:8039/request1

        //方法String getQueryString()获取请求行，?后面的所有参数
        String query=request.getQueryString();
        System.out.println("query = " + query);

        //获取WEB应用名称 String getContextPath()
        String path=request.getContextPath(); // /web01
        System.out.println("path = " + path);
        //获取WEB应用名称，结合重定向使用
        //response.sendRedirect(request.getContextPath()+"ddd");

    }
}
