
package com.progressoft.induction.atm.data;

import java.math.BigDecimal;
import java.util.HashMap;

public class AccountInfo {
    public static HashMap<String,BigDecimal> accounts;
    public AccountInfo(){
        accounts=new HashMap<>();
        accounts.put("123456789", new BigDecimal(1000.0));
        accounts.put("111111111", new BigDecimal(1000.0));
        accounts.put("222222222", new BigDecimal(1000.0));
        accounts.put("333333333", new BigDecimal(1000.0));
        accounts.put("444444444", new BigDecimal(1000.0));
    }


    
}
