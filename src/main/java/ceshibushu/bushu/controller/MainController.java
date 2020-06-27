package ceshibushu.bushu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/6/27
 * @Content:
 **/
@RequestMapping("/")
@Controller
public class MainController {
    @RequestMapping("/data")
    @ResponseBody
    public String data(){
        System.out.println("---------data---------");
        return "hello word";
    }
}
