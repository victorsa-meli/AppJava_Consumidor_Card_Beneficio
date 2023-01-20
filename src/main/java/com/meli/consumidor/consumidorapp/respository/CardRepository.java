package com.meli.consumidor.consumidorapp.respository;

import com.meli.consumidor.consumidorapp.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CardRepository extends JpaRepository<Card, Long> {

    Optional<Card> findByNumber(Long number);


}
