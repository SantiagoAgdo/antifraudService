package com.payu.antifraud.controller;

import com.payu.antifraud.dto.CreditCardTransaction;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anti-fraud")
public class AntiFraudService {
    @PostMapping("/validate")
    public String validate(@RequestBody CreditCardTransaction transaction) {
        if ( transaction.getAmount() == null){
            return "INVALID";
        }
        return "VALID";
    }
}
