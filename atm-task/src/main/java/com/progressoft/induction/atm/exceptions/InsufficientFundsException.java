package com.progressoft.induction.atm.exceptions;

import java.math.BigDecimal;

public class InsufficientFundsException extends RuntimeException{

    public InsufficientFundsException(String accountNumber,BigDecimal amount) {
        System.out.println("Account with account number "+accountNumber+ "does not have "+amount+" money");
        
    }
    
}
