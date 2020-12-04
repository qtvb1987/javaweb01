package com.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 获取浏览器所携带的Cookie对象
 */
@WebServlet(urlPatterns = "/gets")
public class GetCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           //从Request对象中获取浏览器携带的Cookie对象
        Cookie[] cookies=request.getCookies();
        for (Cookie cookie:cookies
             ) {
            if(cookie.getName().equals("web")) {
                String name = cookie.getName();
                String value = URLDecoder.decode(cookie.getValue(),"utf-8");
                System.out.println(name + " = " + value);
            }
        }
    }
}
