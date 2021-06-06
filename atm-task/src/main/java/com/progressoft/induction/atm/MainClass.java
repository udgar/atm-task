package com.progressoft.induction.atm;

import com.progressoft.induction.atm.data.Banknote;
import com.progressoft.induction.atm.bankingoperation.ATM;
import com.progressoft.induction.atm.bankingoperation.ATMImp;
import com.progressoft.induction.atm.bankingoperation.BankingSystem;
import com.progressoft.induction.atm.bankingoperation.BankingSystemImp;
import com.progressoft.induction.atm.utility.DisplayNotes;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATMImp();
        BankingSystem bankingSystem = new BankingSystemImp();
        String answer;
        do {
            System.out.println("What operation is it that you want to perform?");
            System.out.println("1.WithDraw the amount from bank");
            System.out.println("2.View how much money you have in your account");
            System.out.println("2.View how much money you have in your account");
            System.out.println("3.Debit your account");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount you want to withdraw");
                    BigDecimal amount = scanner.nextBigDecimal();
                    BigDecimal[] diviser = amount.divideAndRemainder(new BigDecimal("5.0"));
                    System.out.println("Enter the account number");
                    String accountNumber = scanner.next();
                    List<Banknote> notes = atm.withdraw(accountNumber, amount);
                    new DisplayNotes(notes);
                    break;
                case 2:
                    System.out.println("Enter the account number");
                    String accountNumberForCheck = scanner.next();
                    System.out.println("The balance in account number" + accountNumberForCheck + " is" + bankingSystem.getAccountBalance(accountNumberForCheck));
                    break;
                case 3:
                    System.out.println("Enter the amount you want to debit");
                    BigDecimal amountForDebit=scanner.nextBigDecimal();
                    System.out.println("Enter the account number");
                    String accountNumberForDebit=scanner.next();
                    bankingSystem.debitAccount(accountNumberForDebit, amountForDebit);
                    break;
                default:
                    System.out.println("Enter the appropriate choice");
                    break;
            }
            System.out.println("Do you want to continue with your operations y/n");
            answer=scanner.next();
        } while (answer.equalsIgnoreCase("y"));

    }

}
