import java.util.Scanner;

public class booking {

    static String passengerName = "";
    static int trainNumber;
    static String source = "";
    static String destination = "";
    static boolean ticketBooked = false;

    // Reserve Ticket
    public static void reserveTicket(Scanner sc) {

        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();

        System.out.print("Enter Train Number: ");
        trainNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Source Station: ");
        source = sc.nextLine();

        System.out.print("Enter Destination Station: ");
        destination = sc.nextLine();

        ticketBooked = true;

        System.out.println("Ticket Reserved Successfully 🎉");
    }

    // View Ticket
    public static void viewTicket() {

        if (ticketBooked) {

            System.out.println("\n===== TICKET DETAILS =====");
            System.out.println("Passenger Name : " + passengerName);
            System.out.println("Train Number   : " + trainNumber);
            System.out.println("Source         : " + source);
            System.out.println("Destination    : " + destination);

        } else {
            System.out.println("No Ticket Booked ❌");
        }
    }

    // Cancel Ticket
    public static void cancelTicket() {

        if (ticketBooked) {

            ticketBooked = false;

            System.out.println("Ticket Cancelled Successfully ⚠️");

        } else {
            System.out.println("No Ticket Found ❌");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        while (true) {

            System.out.println("\n===== ONLINE RESERVATION SYSTEM =====");
            System.out.println("1. Reserve Ticket");
            System.out.println("2. View Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    reserveTicket(sc);
                    break;

                case 2:
                    viewTicket();
                    break;

                case 3:
                    cancelTicket();
                    break;

                case 4:
                    System.out.println("Thank You For Using Reservation System ❤️");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice ⚠️");
            }
        }
    }
}