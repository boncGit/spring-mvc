package com.qfedu.springmvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Mengxy on 2018/6/29.
 */
public class MyInterceptor2 implements HandlerInterceptor{

    /**
     * 在执行Handler之前执行，用于身份校验(是否可以登录)，权限认证（是否有权限操作）
     * 返回true 表示放行
     * 返回false 表示拦截
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("preHandle2");
        return true;
    }

    /**
     * 在执行handler时,返回ModelAndVew之前执行
     * 如果想要向页面提供一些公共的数据或者一些公用配置信息，可以考虑这里的ModelAndVew对象
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle2");
    }

    /**
     * 在执行Handler之后执行
     * 日志，系统性能分析
     *
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion2");
    }
}
