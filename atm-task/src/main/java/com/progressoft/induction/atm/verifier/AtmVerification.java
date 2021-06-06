/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progressoft.induction.atm.verifier;

import com.progressoft.induction.atm.exceptions.NotEnoughMoneyInATMException;
import java.math.BigDecimal;

public class AtmVerification {

    public AtmVerification(String accountNumber, BigDecimal amount, BigDecimal totalAmount) {
        if (totalAmount.compareTo(amount) == -1) {
            throw new NotEnoughMoneyInATMException(amount, accountNumber);
        }

    }

}
