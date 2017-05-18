package com.ipcount.core;

import com.ipcount.core.repository.ClientRepository;
import com.ipcount.core.util.ClientBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@ComponentScan("com.ipcount.core")
public class ApplicationTest {

    private ClientRepository clientRepository;

    @Autowired
    public void setClientRepository(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Autowired
    private MockMvc mockMvc;


    @Before
    public void setUp() {
        clientRepository.save(ClientBuilder.builderE());
    }


    @Test
    public void checkResponseBody() throws Exception {
        String a = "[{\"id\":1,\"" +
                "statusP\":1,\"" +
                "tPlane\":1,\"" +
                "speedIn\":1,\"" +
                "speedOut\":1,\"" +
                "ipAddress\":\"1\",\"" +
                "name\":\"1\",\"" +
                "phone\":\"1\",\"" +
                "streetName\":\"1\",\"" +
                "houseNumber\":\"1\",\"" +
                "flatNumber\":\"1\",\"" +
                "mail\":\"1\",\"" +
                "password\":\"1\",\"" +
                "sms\":\"1\",\"" +
                "groupC\":1,\"" +
                "speedLoc\":1,\"" +
                "tools\":\"1\"}]";
        this.mockMvc.perform(get("/clients")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(a)));
    }

    @After
    public void tearDown() {
        clientRepository.deleteAll();

    }


}
