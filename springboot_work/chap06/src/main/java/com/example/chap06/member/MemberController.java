package com.example.chap06.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("member")
public class MemberController {

    @GetMapping("list")
    public String list(Model model) {
        List<Member> list = Arrays.asList(
                                            Member.builder().name("hong").age(20).build(),
                                            Member.builder().name("lee").age(25).build()
                                         );
        System.out.println(list);
        model.addAttribute("list", list);
        model.addAttribute("string", "방가방가햄토리");
        return "list";
    }
}
