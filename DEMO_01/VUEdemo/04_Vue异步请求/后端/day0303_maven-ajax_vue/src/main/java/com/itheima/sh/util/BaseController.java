package com.itheima.sh.util;

import com.alibaba.fastjson.JSON;
import com.itheima.sh.a_vue_axios_01.Result;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseController {

    //1.定义public static <T>T getBean(HttpServletRequest request,Class<T> clazz)方法将请求格式是json的数据封装到实体类对象中
    public static <T> T getBean(HttpServletRequest request, Class<T> clazz) throws Exception{
        //请求乱码
//        request.setCharacterEncoding("utf-8");
        T obj = JSON.parseObject(request.getInputStream(), clazz);//clazz= User.class Role.class
        //返回给调用者
        return obj;
    }
    //2.定义 public static void printResult(HttpServletResponse response, Result result)方法，将json数据响应给浏览器
    public static void printResult(HttpServletResponse response, Result result) throws Exception{
        //5.使用fastjson中的JSON类的方法String toJsonString(Object obj)
//        response.setContentType("text/html;charset=utf-8");
        //响应数据是json格式的数据的MIME类型是：application/json
//        response.setContentType("application/json;charset=utf-8");
        String s = JSON.toJSONString(result);
        //5.响应给前端
        response.getWriter().print(s);
    }
}
