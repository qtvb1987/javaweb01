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
@WebServlet(urlPatterns = "/request4")
public class Request4Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //取数据
        Object ke = request.getAttribute("ke");
        System.out.println("request4-ke = " + ke);
        response.getWriter().print("wo shi request4");
    }
}
