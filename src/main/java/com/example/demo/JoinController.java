package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;

@Controller
public class JoinController {

    @ResponseBody
    @RequestMapping("/join")
    public String join() {
        return "ㅎㅇㅎㅇ";
    }
}