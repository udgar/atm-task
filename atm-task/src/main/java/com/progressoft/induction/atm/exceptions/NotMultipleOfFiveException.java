
package com.progressoft.induction.atm.exceptions;

import java.math.BigDecimal;

public class NotMultipleOfFiveException extends RuntimeException{
    
    public NotMultipleOfFiveException(BigDecimal amount){
        System.out.println("The given amount is not multiple of five");
    }
    
}
