package assignment1;

import java. util.Scanner;
public class CurrencyConverterUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            String currentCurrency, convertedCurrency;
            double amount;
            int choice;
            
            System.out.println("CURRENCY CONVERTER APPLICATION");
            
            System.out.print("Enter -1 to exit: ");
            choice = sc.nextInt();
            
            while(choice!=-1){
            System.out.print("Enter current currency (MYR,USD,EUR): ");
            currentCurrency = sc.next();
            System.out.print("Enter amount: ");
            amount = sc.nextDouble();
            System.out.print("Enter converted currency (MYR,USD,EUR): ");
            convertedCurrency = sc.next();
            
            CurrencyConverter c = new CurrencyConverter(currentCurrency,convertedCurrency,amount);
            c.getConvertedAmount();
            
            System.out.println(c.toString());
            System.out.println("THANK YOU FOR USING CURRENCY CONVERTER APPLICATION");
            System. out.print("Enter -1 to exit: ");
            choice = sc.nextInt();
            }
    }
}
