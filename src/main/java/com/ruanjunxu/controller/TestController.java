package com.ruanjunxu.controller;

import com.ruanjunxu.common.JsonData;
import com.ruanjunxu.exception.ParamException;
import com.ruanjunxu.param.TestVo;
import com.ruanjunxu.util.BeanValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * controller测试类
 * @auther ruanjunxu
 * @email ruanjunxu@qq.com
 * @create 2018/1/20 13:43
 */
@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {


    @RequestMapping("/hello.json")
    @ResponseBody
    public JsonData hello() {
        log.info("hello");
//        throw new PermissionException("Test exception");
        return JsonData.success("Hello, permission");
    }

    @RequestMapping("/validate.json")
    @ResponseBody
    public JsonData validate(TestVo vo) throws ParamException{
        log.info("validate");

        // 参数校验
        BeanValidator.check(vo);

        return JsonData.success("test, validate");
    }

}
