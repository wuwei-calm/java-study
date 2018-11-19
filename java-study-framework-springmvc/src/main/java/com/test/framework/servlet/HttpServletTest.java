package com.test.framework.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author czg
 * @date 2018/11/10
 * 传统的servlet配置的web程序，需要一个一个的在web.xml中部署，也就是在部署描述符之中添加servlet。
 * 用sping之后，只需要配置一个servlet就可以了，那就是DispatcherServlet
 */
public class HttpServletTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入doget请求");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("Hello World!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
