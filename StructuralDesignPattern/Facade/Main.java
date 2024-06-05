package Educational_Initiatives.DesignPatterns.StructuralDesignPattern.Facade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 4;
        do{
            System.out.print("========= Mobile Shop ============ \n");
            System.out.print("            1. SAMSUNG.              \n");
            System.out.print("            2. APPLE.              \n");
            System.out.print("            3. MOTO.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            ShopKeeper shopKeeper = new ShopKeeper();

            switch (choice){
                case 1: shopKeeper.buySamsung();
                case 2: shopKeeper.buyApple();
                case 3: shopKeeper.buyMoto();
                default: System.out.println("Please select appropriate option.");
            }
        }while (choice != 4);
    }
}
