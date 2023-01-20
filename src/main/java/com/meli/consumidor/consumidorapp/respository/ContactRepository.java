package com.meli.consumidor.consumidorapp.respository;

import com.meli.consumidor.consumidorapp.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
