import java.util.Scanner;

public class bankinter {

    static double balance = 10000;

    // Withdraw Method
    public static void withdraw(Scanner sc) {

        System.out.println("Enter Amount To Withdraw:");
        double withdrawAmount = sc.nextDouble();

        if (withdrawAmount > balance) {
            System.out.println("Not Enough Balance ⚠️");
        } 
        else {
            balance = balance - withdrawAmount;

            System.out.println("Money Withdrawn Successfully 🎉");
            System.out.println("Current Balance: " + balance);
        }
    }

    // Deposit Method
    public static void deposit(Scanner sc) {

        System.out.println("Enter Amount To Deposit:");
        double depositAmount = sc.nextDouble();

        balance = balance + depositAmount;

        System.out.println("Money Deposited Successfully 🎉");
        System.out.println("Current Balance: " + balance);
    }

    // Check Balance Method
    public static void checkBalance() {

        System.out.println("Your Current Balance Is: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        while (true) {

            System.out.println("\n===== ATM INTERFACE =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    withdraw(sc);
                    break;

                case 2:
                    deposit(sc);
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.out.println("Thank You For Using ATM ❤️");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice ⚠️");
            }
        }
    }
}