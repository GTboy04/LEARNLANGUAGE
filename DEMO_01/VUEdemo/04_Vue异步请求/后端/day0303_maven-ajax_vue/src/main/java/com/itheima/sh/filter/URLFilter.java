package com.itheima.sh.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class URLFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        //解决请求乱码
        request.setCharacterEncoding("utf-8");
        response.setStatus(200); // 设置状态码
        response.setContentType("application/json;charset=utf-8");// 设置返回类型
        // 设置允许跨域
        //表示允许请求时的origin值(发出请求的网址)
        /*
            1.Access-Control-Allow-Origin：访问控制允许源
		       服务器B 要允许 服务器A页面发起跨域请求
		    2.http://localhost:63342：表示服务器A的地址，如果是所有这里可以书写*,部分地址，可以使用数组
		        1）Access-Control-Allow-Origin 不支持连续设置以逗号分隔的多个域名
		        2）请求头的 Origin 由浏览器自动指定，不可手动更改，但可以通过 request.getHeader("origin") 读取该值；
         */
        /*String[] arr = {"http://localhost:63342", "http://localhost:63341"};
        //获取请求头的 Origin的值
        String myOrigin = request.getHeader("origin");//http://localhost:63342
        boolean isValid = false;
        //遍历数组
        for( String ip : arr ) {
            if( myOrigin != null && myOrigin.equals(ip) ){
                isValid = true;
                break;
            }
        }
        response.setHeader("Access-Control-Allow-Origin", isValid ? myOrigin : "null");*/

//        response.setHeader("Access-Control-Allow-Origin", "http://localhost:63342");
        response.setHeader("Access-Control-Allow-Origin", "*");
//        //该字段必需，它的值是逗号分隔的一个字符串，表明服务器支持的所有跨域请求的方法。
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
////        如果浏览器请求包括Access-Control-Request-Headers字段，
//                //  则Access-Control-Allow-Headers字段是必需的。
        response.setHeader("Access-Control-Allow-Headers", "content-type");
//                //如果需要多个,可以加
//        //        response.setHeader("Access-Control-Allow-Headers", "content-type,authorization");
//        //该字段可选，用来指定本次预检请求的有效期，单位为秒。上面结果中，有效期是1分钟（60秒），
//        // 即允许缓存该条回应1分钟，在此期间，不用发出另一条预检请求。
        response.setHeader("Access-Control-Max-Age", "60");

        //测试code
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
    }

}
