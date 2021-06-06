package com.progressoft.induction.atm.utility;

import com.progressoft.induction.atm.data.Banknote;
import java.math.BigDecimal;
import java.util.List;

public class DisplayNotes {
    private int fiftyNote=0;
    private int twentyNote=0;
    private int tenNote=0;
    private int fiveNote=0;
    public DisplayNotes(List<Banknote> notes){
        notes.forEach((note) -> {
            if(note.getValue().compareTo(new BigDecimal("50.0"))==0){
                fiftyNote++;
            }
            else if(note.getValue().compareTo(new BigDecimal("20.0"))==0){
                twentyNote++;
            }
            else if(note.getValue().compareTo(new BigDecimal("10.0"))==0){
                tenNote++;
            }
            else if(note.getValue().compareTo(new BigDecimal("5.0"))==0){
                fiveNote++;
            }
        });
        System.out.println("The withdrawn amount consist of "+fiftyNote+" fifty notes");
        System.out.println("The withdrawn amount consist of "+twentyNote+" twenty notes");
        System.out.println("The withdrawn amount consist of "+tenNote+" ten notes");
        System.out.println("The withdrawn amount consist of "+fiveNote+" five notes");
    }
}
