package com.meli.consumidor.consumidorapp.respository;

import com.meli.consumidor.consumidorapp.entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerRepository extends JpaRepository<Consumer, Long> {

}
