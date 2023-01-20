package com.meli.consumidor.consumidorapp.respository;

import com.meli.consumidor.consumidorapp.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
