package Educational_Initiatives.DesignPatterns.StructuralDesignPattern.Adapter;

public class Main {
    public static void main(String[] args) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.println(targetInterface.getCreditCard());
    }
}
