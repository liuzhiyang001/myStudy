package com.lzy.myjdbctemplate.controller;


import com.lzy.myjdbctemplate.entity.PrintTemplate;
import com.lzy.myjdbctemplate.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 19:03 2019/2/25
 * @ Description：
 */
@Controller
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("lodop")
    public String index() {
        return "lodop2";
    }
    @GetMapping("index")
    public String index1() {
        return "index";
    }
    @GetMapping("liuzhiyang")
    public String index2() {
        return "liuzhiyang";
    }
    @GetMapping("123")
    public String index123() {
        return "123";
    }

    /**
     * @Date
     * @description :设计模板
     * @author :lzy
    */
    @RequestMapping("setTemplate")
    public String setTemplate(PrintTemplate template){
        String str=""+template+"";

        this.setTemplate(template);
        //System.out.println(str);
        return str;
    }

    /**
     * @Date
     * @description :返回打印模板
     * @author :lzy
    */
    @RequestMapping("user")
    @ResponseBody
    public String get(String name){
        String str=iUserService.getUser().replaceAll("天道酬勤",name);
        //System.out.println(str);
        return str;
    }
    @RequestMapping("desgin")
    public String getTemplate(String template){
        return "/123";
    }

}
