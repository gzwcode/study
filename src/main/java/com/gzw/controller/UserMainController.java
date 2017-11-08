package com.gzw.controller;
/**
 * @author:龚增伟
 * @Date :2017/11/7 17:16
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/user")
public class UserMainController {


    /**
    * @author: 龚增伟
    * @describe: TODO
    * param:  * @param null
    * @Date: 2017/11/7 17:44
    **/
    @RequestMapping("/login")
    public String login(){
        System.out.println("hello idea");
        return "web/index";
    }

    /**
    * @author: 龚增伟
    * @describe: TODO
    * param:  * @param null
    * @Date: 2017/11/8 16:39
    **/
    @RequestMapping("/out")
    public String out() {
        System.out.println("测试代码");
        return null;
    }


}
