package org.skypro.skyshop.service;

import org.skypro.skyshop.exceptions.NoSuchProductException;
import org.skypro.skyshop.model.basket.ShopError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ShopControllerAdvice {

    @ExceptionHandler
    public ResponseEntity<ShopError> shopErrorResponseEntity(NoSuchProductException e) {
        return new ResponseEntity<>(new ShopError("404", "Такого товара не существует"), HttpStatus.NOT_FOUND);
    }

}
