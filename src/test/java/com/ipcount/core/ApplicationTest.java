package com.ipcount.core;

import com.ipcount.core.entity.ClientEntity;
import com.ipcount.core.repository.ClientRepository;
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

import java.util.Date;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@ComponentScan("com.ipcount.core")
public class ApplicationTest {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private MockMvc mockMvc;


    @Before
    public void setUp() {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setStatusP(1);
        clientEntity.setId(1);
        clientEntity.setAddress("1");
        clientEntity.setBalance(1.0);
        clientEntity.setDate(new Date(12));
        clientEntity.setFlatNumber("1");
        clientEntity.setGroupC(1);
        clientEntity.setHosts("1");
        clientEntity.setHouseNumber("1");
        clientEntity.setI("1");
        clientEntity.setMac("1");
        clientEntity.setMacR(1);
        clientEntity.setMail("1");
        clientEntity.setnDog(1);
        clientEntity.setName("1");
        clientEntity.setRule(1);
        clientEntity.setRuleR(1);
        clientEntity.setSpeedInR(1);
        clientEntity.setSpeedLoc(1);
        clientEntity.setSpeedLocR(1);
        clientEntity.setSpeedOutR(1);
        clientEntity.setStatus(1);
        clientEntity.setStatusP(1);
        clientEntity.settPlane(1);
        clientEntity.setSpeedIn(1);
        clientEntity.setSpeedOut(1);
        clientEntity.setIpAddress("1");
        clientEntity.setName("1");
        clientEntity.setPhone("1");
        clientEntity.setStreetName("1");
        clientEntity.setHouseNumber("1");
        clientEntity.setFlatNumber("1");
        clientEntity.setMail("1");
        clientEntity.setPassword("1");
        clientEntity.setSms("1");
        clientEntity.setGroupC(1);
        clientEntity.setSpeedLoc(1);
        clientEntity.setTools("1");
        clientRepository.save(clientEntity);
    }


    @Test
    public void checkResponseBody() throws Exception {
        this.mockMvc.perform(get("/clients")).andDo(print())
                // .andExpect(status().isOk())
                .andExpect(content().string(containsString("[{\"id\":1,\"statusP\":1,\"tPlane\":1,\"speedIn\":1,\"speedOut\":1,\"ipAddress\":\"1\",\"name\":\"1\",\"phone\":\"1\",\"streetName\":\"1\",\"houseNumber\":\"1\",\"flatNumber\":\"1\",\"mail\":\"1\",\"password\":\"1\",\"sms\":\"1\",\"groupC\":1,\"speedLoc\":1,\"tools\":\"1\"}]")));
    }

    @After
    public void tearDown() {

    }

}
