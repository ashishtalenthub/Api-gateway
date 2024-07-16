package com.example.example_service.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(GreetingController.class)
public class GreetingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void greeting_ReturnsHelloMessage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/example/greeting"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello from Example Microservice!"));
    }


}
