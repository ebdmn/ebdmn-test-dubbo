package com.ebdmn.controller;



import com.ebdmn.manager.api.service.IDubboTestManager;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @DubboReference(version="1.0.0")
    private IDubboTestManager dubboTestManager;

    @GetMapping("/dubbo")
    @ResponseBody
    public String getFromProvider(){
        String hello = dubboTestManager.hello();
        return hello;
    }
}
