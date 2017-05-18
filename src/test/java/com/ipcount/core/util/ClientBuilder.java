package com.ipcount.core.util;

import com.ipcount.core.entity.ClientEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class ClientBuilder {

    public ClientBuilder() {
    }

    public static ClientEntity builderE() {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity = ClientEntity.builder()
                .setHosts("1")
                .setIpAddress("1")
                .setMac("1")
                .setRule(1)
                .setI("1")
                .setStatus(1)
                .settPlane(1)
                .setName("1")
                .setPhone("1")
                .setSms("1")
                .setAddress("1")
                .setStreetName("1")
                .setHouseNumber("1")
                .setFlatNumber("1")
                .setMail("1")
                .setPassword("1")
                .setBalance(1.0)
                .setSpeedIn(1)
                .setSpeedOut(1)
                .setSpeedLoc(1)
                .setDate(new Date(12))
                .setnDog(1)
                .setGroupC(1)
                .setStatusP(1)
                .setMacR(1)
                .setRuleR(1)
                .setSpeedInR(1)
                .setSpeedOutR(1)
                .setSpeedInR(1)
                .setSpeedLocR(1)
                .setTools("1").build();
        return clientEntity;
    }
}
