package com.progressoft.induction.atm.exceptions;

public class AccountNotFoundException extends RuntimeException {
        public AccountNotFoundException(String accountNumber){
            System.out.println(accountNumber+" does not exists");
            
        }
       
    
    
}
