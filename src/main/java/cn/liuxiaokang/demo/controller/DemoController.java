package cn.liuxiaokang.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuxiaokang
 * @Date: 2018/12/3 9:32
 */
@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo() {
        return "this is jenkins test project";
    }
}
