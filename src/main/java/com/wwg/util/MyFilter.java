package com.wwg.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 使用注解标注过滤器
 * @WebFilter将一个实现了javax.servlet.Filter接口的类定义为过滤器
 * 属性filterName声明过滤器的名称,可选
 * 属性urlPatterns指定要过滤 的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
 * @author Administrator
 *
 */
public class MyFilter implements Filter {

    @Override
    public void destroy() {
       // System.out.println("过滤器销毁");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
       // System.out.println("执行过滤操作");
        HttpServletResponse res = (HttpServletResponse) response;
        HttpServletRequest req=(HttpServletRequest) request;
        res.setCharacterEncoding("utf-8");
        //这里填写你允许进行跨域的主机ip
        res.setHeader("Access-Control-Allow-Origin", "*");
        //允许的访问方法
        res.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE, PATCH");
        //Access-Control-Max-Age 用于 CORS 相关配置的缓存
        res.setHeader("Access-Control-Max-Age", "3600");
        res.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        String path=req.getRequestURI();
        System.out.println(path);
//        InputStream in = req.getInputStream();
//        byte[] b=new byte[1024];
//        int len=in.read(b);
//        System.out.println("读入长度为："+len);
//        System.out.println(new String(b,0,len));  
        chain.doFilter(req, res);
        
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        //System.out.println("过滤器初始化");
    }
}
