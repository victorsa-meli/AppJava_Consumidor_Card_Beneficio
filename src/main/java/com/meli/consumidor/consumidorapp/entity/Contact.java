package com.meli.consumidor.consumidorapp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Consumer consumer;

    private int mobilePhoneNumber;
    private int residencePhoneNumber;
    private int phoneNumber;
    private String email;

}
