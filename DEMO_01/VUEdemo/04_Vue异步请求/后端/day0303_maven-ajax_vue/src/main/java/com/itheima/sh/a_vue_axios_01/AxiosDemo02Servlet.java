package com.itheima.sh.a_vue_axios_01;


import com.itheima.sh.util.BaseController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

@WebServlet("/axiosDemo02Servlet")
public class AxiosDemo02Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            //1.创建集合对象保存多个好友
            ArrayList<Friend> list = new ArrayList<>();
            //2.向集合添加数据
            Collections.addAll(list, new Friend("001", "张三", 18), new Friend("002", "李四", 19),
                                new Friend("003", "王五", 20));
            //3.将list放到Result对象中
            Result result = new Result(true, "查询好友成功", list);
            //4.将result对象转换json并响应给前端
            BaseController.printResult(response, result);

        } catch (Exception e) {
            e.printStackTrace();
            try {
                //6.将list放到Result对象中
                Result result = new Result(false, "查询好友失败");
                //7.将result对象转换json并响应给前端
                BaseController.printResult(response, result);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}
