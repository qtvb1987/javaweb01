package com.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * request对象 作为域对象使用
 */
@WebServlet(urlPatterns = "/request3")
public class Request3Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //向request域对象中存数据
        request.setAttribute("ke","java");
        //取数据
        Object ke = request.getAttribute("ke");
        System.out.println("request3-ke = " + ke);
        //请求转发
        request.getRequestDispatcher("/request4").forward(request,response);
    }
}
