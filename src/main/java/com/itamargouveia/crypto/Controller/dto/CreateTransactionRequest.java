package com.itamargouveia.crypto.Controller.dto;


public record CreateTransactionRequest(String userDocument,
                                       String creditCardToken,
                                       Long value) {
}
    

