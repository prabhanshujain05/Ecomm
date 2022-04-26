package com.springboot.mydemo.dao.address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.springboot.mydemo.model.address.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
