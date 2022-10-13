package com.gupaoedu.course.mybatis.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.gupaoedu.course.springbootdemo.SpringBootDemoApplication;

/**
 * HelloController集成测试
 *
 * @author daijiong
 * @version : HelloControllerIntegrationTest.java, v 0.1 2021/10/4 21:40 daijiong Exp $$
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
@AutoConfigureMockMvc
class HelloControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test() throws Exception {
        // when
        ResultActions result = mvc.perform(get("/test").contentType(MediaType.APPLICATION_JSON));
        // then
        result.andDo(print()).andExpect(status().isOk()).andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }
}