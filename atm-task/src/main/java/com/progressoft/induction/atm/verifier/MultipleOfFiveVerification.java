
package com.progressoft.induction.atm.verifier;

import com.progressoft.induction.atm.exceptions.NotMultipleOfFiveException;
import java.math.BigDecimal;


public class MultipleOfFiveVerification {

    public MultipleOfFiveVerification(BigDecimal amount) {
        BigDecimal[] diviser=amount.divideAndRemainder(new BigDecimal("5.0"));
        if (diviser[1].compareTo(BigDecimal.ZERO) == 0) {
            return;
        }
        else{
            throw new NotMultipleOfFiveException(amount);
        }
    }

}
