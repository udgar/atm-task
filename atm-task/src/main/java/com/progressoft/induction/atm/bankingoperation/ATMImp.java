package com.progressoft.induction.atm.bankingoperation;

import com.progressoft.induction.atm.data.AccountInfo;
import com.progressoft.induction.atm.data.BankTotal;
import com.progressoft.induction.atm.data.Banknote;
import com.progressoft.induction.atm.utility.ReturnListOfMoney;
import com.progressoft.induction.atm.verifier.AtmVerification;
import com.progressoft.induction.atm.verifier.BalanceVerification;
import com.progressoft.induction.atm.verifier.AccountVerification;
import com.progressoft.induction.atm.verifier.MultipleOfFiveVerification;
import java.math.BigDecimal;
import java.util.List;

public class ATMImp implements ATM {

    public BigDecimal totalAmount;
    public ReturnListOfMoney list;

    //public AccountInfo accounts;
    public ATMImp() {
        AccountInfo accounts = new AccountInfo();
        BankTotal bankTotal = new BankTotal();
        totalAmount = bankTotal.getTotalAmount();        
        list = new ReturnListOfMoney();
    }

    @Override
    public List<Banknote> withdraw(String accountNumber, BigDecimal amount) {
        MultipleOfFiveVerification.multipleOfFiveVerification(amount);
        AccountVerification.accountVerification(accountNumber);
        new BalanceVerification(accountNumber, amount);
        new AtmVerification(accountNumber, amount, totalAmount);
        List<Banknote> notes = list.returnNote(amount);
        BigDecimal accountAmount = AccountInfo.accounts.get(accountNumber);
        AccountInfo.accounts.put(accountNumber, accountAmount.subtract(amount));
        totalAmount = totalAmount.subtract(amount);
        return notes;

    }

}
