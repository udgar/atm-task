package com.progressoft.induction.atm.bankingoperation;

import com.progressoft.induction.atm.data.Banknote;
import java.math.BigDecimal;
import java.util.List;

public interface ATM {

    List<Banknote> withdraw(String accountNumber, BigDecimal amount);
}
