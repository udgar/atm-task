package com.progressoft.induction.atm.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankTotal {

    public BigDecimal totalAmount;

    public BankTotal() {

        List<Banknote> notes = new ArrayList<>();
        totalAmount = new BigDecimal("0.0");
        for (int i = 0;
                i < 10; i++) {
            notes.add(Banknote.FIFTY_JOD);
        }
        for (int i = 0;
                i < 20; i++) {
            notes.add(Banknote.TWENTY_JOD);
        }
        for (int i = 0;
                i < 100; i++) {
            notes.add(Banknote.TEN_JOD);
        }
        for (int i = 0;
                i < 100; i++) {
            notes.add(Banknote.FIVE_JOD);
        }

        for (Banknote note : notes) {
            totalAmount = totalAmount.add(note.getValue());
        }
    }

    public BigDecimal getTotalAmount() {

        return totalAmount;
    }
}
