package com.wang.springsecuritystudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lucksoul 王吉慧
 * @version 1.0
 * @date 2021/9/25 11:44
 */
@RestController
public class MyController {

    /**
     * 查询当前用户信息
     */
    @GetMapping("/getUserList")
    public Map<String, Object> getUserList() {
        return new HashMap<String, Object>(){{
            put("username", "张三");
            put("sex", "男");
            put("age", "20");
        }};
    }

    /**
     * 用户登录
     */
    @GetMapping("/mylogin")
    public Map<String, Object> login() {
        return new HashMap<String, Object>(){{
            put("code", 200);
            put("msg", "登录成功");
        }};
    }
}
