package com.progressoft.induction.atm.data;

import java.math.BigDecimal;

public enum Banknote {

    FIVE_JOD(new BigDecimal("5.0")),
    TEN_JOD(new BigDecimal("10.0")),
    TWENTY_JOD(new BigDecimal("20.0")),
    FIFTY_JOD(new BigDecimal("50.0"));

    private BigDecimal value;

    Banknote(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}


