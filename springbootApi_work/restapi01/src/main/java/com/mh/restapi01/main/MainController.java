package com.mh.restapi01.main;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MainController {
    /*
      @Autowired를 쓰는 것 보다
      위에 선언되어있는 @RequiredArgsConstructor를 권장
    */

    //@Autowired
    private final MainService service;

    @GetMapping("main")
    public String main() {
        return "main";
    }

    // 웹페이지가 아닌 문자열이 출력
    @GetMapping("mainapi")
    public @ResponseBody String mainapi() {
        return "mainapi";
    }
}


