import java.util.Scanner;

public class examination {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Questions
        String[] questions = {
            "1. What is the capital of India?\n1. Delhi\n2. Mumbai\n3. Kolkata\n4. Chennai",

            "2. Which language is used for Android Development?\n1. Python\n2. Java\n3. C\n4. HTML",

            "3. Who is known as the Father of Computer?\n1. Charles Babbage\n2. Newton\n3. Einstein\n4. Tesla"
        };

        // Correct Answers
        int[] answers = {1, 2, 1};

        int score = 0;

        System.out.println("===== ONLINE EXAMINATION SYSTEM =====");

        // Loop for questions
        for (int i = 0; i < questions.length; i++) {

            System.out.println();
            System.out.println(questions[i]);

            System.out.print("Enter Your Answer: ");
            int userAnswer = sc.nextInt();

            // Check Answer
            if (userAnswer == answers[i]) {
                System.out.println("Correct Answer 🎉");
                score++;
            } 
            else {
                System.out.println("Wrong Answer ❌");
            }
        }

        // Final Score
        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score: " + score + "/" + questions.length);

        sc.close();
    }
}