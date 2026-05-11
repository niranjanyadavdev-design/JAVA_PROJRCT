import java.util.Random;
import java.util.Scanner;
public class guessingNumber{
    public static void main (String[] args) {
        Random number = new Random();
        Scanner sc = new Scanner (System.in);
        int num = number.nextInt(100) + 1;
        int attemp = 0;
        int guess = 0;
        System.out.println("Welcome To Number Guessing Game");
        System.out.println("in the number is 1 to 100");
        while (guess != num){
            System.out.println("Enter Your Guessing Number :");
            guess = sc.nextInt();
            attemp++;
            if (num>guess){
                System.out.println("IT IS TOO LOW! ");
            }
            else if (num<guess){
                System.out.println("IT IS TOO HIGH! ");
            }
            else{
                System.out.println("IT IS CORRECT ANSWER🎉");
                System.out.println("You guessed in " + attemp + " attempts");
              
            }
        }
        sc.close();
    }
}