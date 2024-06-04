package Educational_Initiatives.DesignPatterns.StructuralDesignPattern.Adapter;

import java.util.Scanner;

public class BankCustomer extends BankDetail implements CreditCard {

    @Override
    public void giveBankDetails() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the account holder name: ");
            String customerName = sc.nextLine();
            System.out.println();

            System.out.println("Enter the account number: ");
            long accountNo = Long.parseLong(sc.nextLine());
            System.out.println();

            System.out.println("Enter the bank name: ");
            String bankName = sc.nextLine();
            System.out.println();

            setAccountHolderName(customerName);
            setAccountNumber(accountNo);
            setBankName(bankName);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getCreditCard() {
        long accountNumber = getAccountNumber();
        String accountHolderName = getAccountHolderName();
        String bankName = getBankName();
        return "The Account number "+accountNumber+" of "+accountHolderName+" in "+bankName+ " bank is valid and authenticated for issuing the credit card.";
    }
}
