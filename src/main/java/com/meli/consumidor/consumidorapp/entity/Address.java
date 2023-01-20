package com.meli.consumidor.consumidorapp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Consumer consumer;

    private String street;
    private int number;
    private String city;
    private String country;
    private int portalCode;
}