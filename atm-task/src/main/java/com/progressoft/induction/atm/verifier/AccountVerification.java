package com.progressoft.induction.atm.verifier;

import com.progressoft.induction.atm.data.AccountInfo;
import com.progressoft.induction.atm.exceptions.AccountNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;

public class AccountVerification {

    public AccountVerification(String accountNumber){
        
        HashMap<String,BigDecimal> account1=AccountInfo.accounts;
        if(!account1.containsKey(accountNumber)){
            throw new AccountNotFoundException(accountNumber);
        }


    }


}
