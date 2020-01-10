package com.skjj.sspu.sspu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: sspu
 * @description:
 * @author: Lee
 * @create: 2020-01-10 09:35
 **/

@Controller
public class WebController {

        @GetMapping("/")
        public String hello (){
            return "index";
        }

}
