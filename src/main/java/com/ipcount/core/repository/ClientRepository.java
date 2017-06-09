package com.ipcount.core.repository;

import com.ipcount.core.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ClientRepository extends CrudRepository<ClientEntity, Integer> {
    List<ClientEntity> findByName(String name);

}
