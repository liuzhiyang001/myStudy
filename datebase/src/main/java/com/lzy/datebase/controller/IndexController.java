package com.lzy.datebase.controller;


import com.alibaba.fastjson.JSONObject;
import com.lzy.datebase.util.LoggerUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
/**
 * @ Author     ：lzy
 * @ Date       ：Created in 10:47 2019/2/25
 * @ Description：
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {
    /**
     * 简单测试请求日志的记录
     * @param request 请求对象
     * @param name 用户名
     * @return
     * @throws Exception
     */


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public JSONObject login(HttpServletRequest request, String name) throws Exception
    {

        Logger logger= LoggerFactory.getLogger("com.lzy.datebase.controller.IndexController");
//       logger

        JSONObject obj = new JSONObject();
        obj.put("msg","用户："+name+"，登录成功。");
        //将返回值写入到请求对象中
        request.setAttribute(LoggerUtils.LOGGER_RETURN,obj);
        String str="哈哈哈";
        logger.info("123333------------------------------------");
        System.out.println(str);
        //LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();   // print logback's internal status   StatusPrinter.print(lc);
       // StatusPrinter.print(lc);

        //LoggerEntity loggerEntity=new LoggerEntity();
        //loggerEntity.setClientIp("123");
//        List list=new ArrayList();
//        list.get(0);
        return obj;
    }
}
