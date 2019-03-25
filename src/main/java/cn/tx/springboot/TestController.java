package cn.tx.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jingli
 * @date 2019/3/25 - 10:29
 */
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
