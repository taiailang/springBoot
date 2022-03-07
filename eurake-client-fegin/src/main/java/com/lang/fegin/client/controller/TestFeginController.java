package com.lang.fegin.client.controller;

import com.lang.fegin.client.service.HelloService;
import com.lang.fegin.client.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * feign调用的Controller
 * Created by Raye on 2017/6/26.
 */
@RestController
public class TestFeginController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private TestService testService;

    /**
     * 远程通过feign调用另外一个项目的方法
     * @param name
     * @return
     */
    @RequestMapping("hello")
    public String hello(String name){
        return helloService.sayHelloFromRibbon(name);
    }

    /**
     * 使用ribbon方式调用的方法
     * @param name
     * @return
     */
    @RequestMapping("ribbonhello")
    public String sayHello(String name){
        return "hello "+name+" this is feign spring cloud";
    }

    /**
     * 自测远程调用
     * @return
     */
    @RequestMapping("test")
    public String test(){
        return testService.test();
    }
}
