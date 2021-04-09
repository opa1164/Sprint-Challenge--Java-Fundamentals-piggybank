package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.Coin;
import com.lambdaschool.piggybank.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CoinController {
    @Autowired
    CoinRepository crepo;

    @GetMapping(value = "/total", produces = {"application/json"})
    private ResponseEntity<?> total(){

        List<Coin> cList = new ArrayList<>();
        crepo.findAll().iterator().forEachRemaining(cList::add);

        double total = 0.0;
        for (Coin c : cList){
            total += c.getValue() * c.getQuantity();
            String coin = c.getQuantity() > 1 ? c.getNamepl() : c.getName();
            System.out.printf("%d %s%n",c.getQuantity(), coin);
        }
        System.out.println("The piggy bank holds " + total);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}