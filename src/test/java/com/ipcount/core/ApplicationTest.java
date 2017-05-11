package com.ipcount.core;

import com.ipcount.core.controller.ClientController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTest {

    @Autowired
    private ClientController controller;

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void notNullTest() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void checkResponseBody() throws Exception {
        this.mockMvc.perform(get("/clients")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("[{\"id\":12,\"statusP\":5,\"tPlane\":8,\"speedIn\":5,\"speedOut\":5,\"ipAddress\":\"45\",\"name\":\"8\",\"phone\":\"9\",\"streetName\":\"5\",\"houseNumber\":\"5\",\"flatNumber\":\"5\",\"mail\":\"5\",\"password\":\"5\",\"sms\":\"q\",\"groupC\":5,\"speedLoc\":5,\"tools\":\"5\"}]")));
    }


}
