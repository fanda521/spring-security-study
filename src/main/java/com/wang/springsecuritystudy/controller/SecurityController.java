package com.wang.springsecuritystudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author lucksoul 王吉慧
 * @version 1.0
 * @date 2021/9/25 11:25
 */
@Controller
public class SecurityController {

    /**
     * 主页面
     * @return
     */
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    /**
     * 用户页面
     * @return
     */
    @GetMapping("/users")
    public String users(){
        return "users";
    }/**
     * 角色页面
     * @return
     */
    @GetMapping("/roles")
    public String roles(){
        return "roles";
    }

    /**
     * 菜单页面
     * @return
     */
    @GetMapping("/menus")
    public String menus(){
        return "menus";
    }
    /**
     * 其他页面
     * @return
     */
    @GetMapping("/others")
    public String others(){
        return "others";
    }

    /**
     * 错误页面
     * @return
     */
    @GetMapping("/error")
    public String error(){
        return "error";
    }

}
