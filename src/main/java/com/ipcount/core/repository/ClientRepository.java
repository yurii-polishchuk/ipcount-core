package com.ipcount.core.repository;

import com.ipcount.core.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;


public interface ClientRepository extends CrudRepository<ClientEntity, Integer> {

}
