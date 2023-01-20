package com.meli.consumidor.consumidorapp.controller;

import com.meli.consumidor.consumidorapp.entity.Extract;
import com.meli.consumidor.consumidorapp.exception.BussinessException;
import com.meli.consumidor.consumidorapp.services.CardService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CardController {

    private final @NonNull
    CardService cardService;

    /*
     * Deve creditar(adicionar) um valor(value) em um no cartão.
     * Para isso ele precisa indenficar qual o cartão correto a ser recarregado,
     * para isso deve usar o número do cartão(cardNumber) fornecido.
     */
    @GetMapping(value = "/setcardbalance")
    public void setBalance(Long cardNumber, Double value) throws BussinessException {
        cardService.setBalance(cardNumber, value);
    }

    @ResponseBody
    @GetMapping(value = "/buy")
    public Extract buy(int establishmentType, String establishmentName,
                       Long cardNumber, String productDescription, Double value) throws BussinessException {
        return cardService.buy(establishmentType,establishmentName,cardNumber,productDescription,value);
    }
}
