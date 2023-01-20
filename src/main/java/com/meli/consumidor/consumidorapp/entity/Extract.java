package com.meli.consumidor.consumidorapp.entity;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;




@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Extract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int establishmentNameId;
    String establishmentName;
    String productDescription;
    Date dateBuy;
    Long cardNumber;
    Double value;
    Double cashback;
    Double taxa;

}