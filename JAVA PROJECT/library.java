import java.util.ArrayList;
import java.util.Scanner;

public class library {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> books = new ArrayList<>();

        int choice;

        while (true) {

            System.out.println("\n===== DIGITAL LIBRARY =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // Add Book
                case 1:

                    System.out.print("Enter Book Name: ");
                    String book = sc.nextLine();

                    books.add(book);

                    System.out.println("Book Added Successfully 📚");
                    break;

                // View Books
                case 2:

                    if (books.isEmpty()) {
                        System.out.println("No Books Available");
                    } else {

                        System.out.println("\nAvailable Books:");

                        for (int i = 0; i < books.size(); i++) {
                            System.out.println((i + 1) + ". " + books.get(i));
                        }
                    }

                    break;

                // Issue Book
                case 3:

                    System.out.print("Enter Book Name To Issue: ");
                    String issueBook = sc.nextLine();

                    if (books.contains(issueBook)) {

                        books.remove(issueBook);

                        System.out.println("Book Issued Successfully ✅");
                    } else {
                        System.out.println("Book Not Found ❌");
                    }

                    break;

                // Return Book
                case 4:

                    System.out.print("Enter Book Name To Return: ");
                    String returnBook = sc.nextLine();

                    books.add(returnBook);

                    System.out.println("Book Returned Successfully 🔄");

                    break;

                // Exit
                case 5:

                    System.out.println("Thank You For Using Library ❤️");
                    sc.close();
                    System.exit(0);

                    break;

                default:
                    System.out.println("Invalid Choice ⚠️");
            }
        }
    }
}