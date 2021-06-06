package com.progressoft.induction.atm.utility;

import com.progressoft.induction.atm.data.Banknote;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ReturnListOfMoney {

    int fiftyAmount = 0;
    int twentyAmount = 0;
    int fiveAmount = 0;
    int tenAmount = 0;


    public List<Banknote> returnNote(BigDecimal amount) {
        BigDecimal temp = amount;
        do {
            if (temp.compareTo(new BigDecimal("50")) == 1||temp.compareTo(new BigDecimal("50")) == 0) {
                temp = temp.subtract(new BigDecimal("50"));
                fiftyAmount++;
            } else {
                if (temp.compareTo(new BigDecimal("20")) == 1||temp.compareTo(new BigDecimal("20")) == 0){
                    temp = temp.subtract(new BigDecimal("20"));
                    twentyAmount++;
                } else {
                    if (temp.compareTo(new BigDecimal("10")) == 1||temp.compareTo(new BigDecimal("10")) == 0) {
                        temp = temp.subtract(new BigDecimal("10"));
                        tenAmount++;
                    } else {
                        if (temp.compareTo(new BigDecimal("5")) == 1||temp.compareTo(new BigDecimal("5")) == 0) {
                            temp = temp.subtract(new BigDecimal("5"));
                            fiveAmount++;
                        }
                    }
                }
            }
            System.out.println(temp);
        } while (temp.compareTo(new BigDecimal("0")) == 1);
        
        List<Banknote> list=new ArrayList<>();
        for (int i = 0; i < fiftyAmount; i++) {
            list.add(Banknote.FIFTY_JOD);
        }
        for (int i = 0; i < twentyAmount; i++) {
            list.add(Banknote.TWENTY_JOD);
        }
        for (int i = 0; i < tenAmount; i++) {
            list.add(Banknote.TEN_JOD);
        }
        for (int i = 0; i < fiveAmount; i++) {
            list.add(Banknote.FIVE_JOD);
        }
        return list;
    }

}
