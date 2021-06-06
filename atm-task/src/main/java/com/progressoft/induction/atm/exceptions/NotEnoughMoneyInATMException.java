package com.progressoft.induction.atm.exceptions;

import java.math.BigDecimal;

public class NotEnoughMoneyInATMException extends RuntimeException {
    
    public NotEnoughMoneyInATMException(BigDecimal amount,String accountNumber) {
        System.out.println("The Atm does not have enough money to withdraw "+amount+" operation performed by"+accountNumber);
    
    }
    
}
