package com.ea.restapi05.member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc   // MockMvc를 사용하기 위한 어노테이션
class MemberControllerTest {
    @Autowired private MockMvc mockMvc;     // 가짜객체라고도 말한다.

    @Test
    void member() throws Exception {
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/member"));

        resultActions
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("member"));
    }
}