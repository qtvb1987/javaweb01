package com.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * 发送Cookie对象 给浏览器
 */
@WebServlet(urlPatterns = "/send")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //定义中文字符串
        String web="java开发";
        // 使用URLEncoder的encode方法进行编码
        String encode= URLEncoder.encode(web,"utf-8");
        //创建Cookie对象
        Cookie cookie=new Cookie("web",encode);
        //发送Cookie给浏览器
        response.addCookie(cookie);
    }
}
