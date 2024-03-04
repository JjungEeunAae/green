package com.mh.restapi01.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainApiController {
    @GetMapping("main/api/aa")
    public String mainApiaa(String str, String id, String age) {
        System.out.println("str = " + str);
        System.out.println("id = " + id);
        System.out.println("age = " + age);
        return "문자열 반환 = { " + str + " }";
    }
}
