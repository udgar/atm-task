package com.progressoft.induction.atm.verifier;

import com.progressoft.induction.atm.data.AccountInfo;
import com.progressoft.induction.atm.exceptions.InsufficientFundsException;
import java.math.BigDecimal;

public class BalanceVerification {

    public BalanceVerification(String accountNumber, BigDecimal amount) {
        BigDecimal accountAmount = AccountInfo.accounts.get(accountNumber);
        if (accountAmount.compareTo(amount) < 0) {
            throw new InsufficientFundsException(accountNumber, amount);
        }
    }

}
