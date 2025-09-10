import java.util.*;

public class Main {
    public static void main(String[] args){
        // Variables
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(1234, 1000.00);
        boolean running = true;

        System.out.println("Welcome to Kim's ATM");
        System.out.print("Please enter pin: ");
        int pin = Integer.parseInt(scanner.nextLine());

        if (!account.checkPin(pin)){
         System.out.println("Wrong pin!");
         System.exit(0);
        }

        System.out.println("Login successful! \n");


        while (running){

            System.out.println("=== ATM Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1:
                    System.out.println("Your balance is " + account.returnBalance());
                    break;
                case 2:
                    System.out.print("Please enter deposit amount: ");
                    double dep = Double.parseDouble(scanner.nextLine());
                    account.deposit(dep);
                    break;
                case 3:
                    System.out.print("Please enter your withdraw amount: ");
                    double with = Double.parseDouble(scanner.nextLine());
                    account.withdraw(with);
                    break;
                case 4:
                    System.out.println("Thanks for using Kim's ATM");
                    running = false;
                break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}