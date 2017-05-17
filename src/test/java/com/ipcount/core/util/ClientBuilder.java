package com.ipcount.core.util;

import com.ipcount.core.entity.ClientEntity;

import java.util.Date;

/**
 * Created by Oksana on 17-May-17.
 */
public class ClientBuilder {
    public static ClientEntity buildEntity(ClientEntity clientEntity) {
       // ClientEntity clientEntity = new ClientEntity();
        clientEntity.setStatusP(1);
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
        return clientEntity;

    }
}
