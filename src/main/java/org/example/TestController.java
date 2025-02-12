package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

/**
 * @Description:
 * @Create: Date:2025年01月23日
 */
@RestController("/test")
public class TestController {


    @GetMapping("/aaa")
    public Object aaa(){
        return "bbb";
    }
}