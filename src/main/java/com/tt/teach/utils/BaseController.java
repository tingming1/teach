package com.tt.teach.utils;

import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

//控制器的工具类
public class BaseController {
    //1.进行日志打印管理
    private  static  final Logger logger = (Logger) LoggerFactory.getLogger(BaseController.class);
    //2.常用变量提取出来，放到base工具类中
    protected  static  final  String SESSION_KEY = "studentName";
    protected  static  final  String FORWARD = "forward:";
    protected  static  final  String REDIRECT = "redirect:";
    //3.常用request，session，response的获取

    public HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }
    public HttpServletResponse getResponse() {
        HttpServletResponse response = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse();
        return response;
    }
    public HttpSession getSession() {
        HttpSession session = getRequest().getSession();
        return session;
    }
}
