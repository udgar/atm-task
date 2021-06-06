
package com.progressoft.induction.atm.bankingoperation;

import com.progressoft.induction.atm.data.AccountInfo;
import com.progressoft.induction.atm.verifier.AccountVerification;
import com.progressoft.induction.atm.verifier.MultipleOfFiveVerification;
import java.math.BigDecimal;


public class BankingSystemImp implements BankingSystem{

    @Override
    public BigDecimal getAccountBalance(String accountNumber) {
       new AccountVerification(accountNumber);
       return AccountInfo.accounts.get(accountNumber);
    }

    @Override
    public void debitAccount(String accountNumber, BigDecimal amount){
      new MultipleOfFiveVerification(amount);
      new AccountVerification(accountNumber);
      BigDecimal initialAmount=AccountInfo.accounts.get(accountNumber);
      BigDecimal newAmount=initialAmount.add(amount);
      AccountInfo.accounts.put(accountNumber, newAmount);
      System.out.println("The new amount of the account "+ accountNumber+" is "+newAmount);
    }
    
}
