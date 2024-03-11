import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int limit =3;
        int score = 0;

        Random random=new Random();
        int rand=random.nextInt(end-start+ 1)+start;
        System.out.println("||Number Guessing Game||");
        System.out.println("Guess any number from " + start + " to " + end);
        Scanner sc = new Scanner(System.in);
        
        boolean play = true;
            while (play) {            
            int attempts = 0;
            boolean crctguess = false;            
            while (attempts < limit && !crctguess) {
                System.out.print("Enter your guess (Attempt " + (attempts + 1) + "): ");
                int guess = sc.nextInt();
                    if (guess == rand) {
                    System.out.println("Congratulations! "+random+" is the correct number");
                    crctguess = true;
                    score += limit - attempts;
                } else if (guess < rand) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                
                attempts++;
            }
            if (!crctguess) {
                System.out.println("Sorry, you've reached the maximum number of attempts.");
                System.out.println("The correct number was: " + rand);
            }

            System.out.print("Wanna play again? (1->Yes,0->No)");
            int playAgain = sc.nextInt();
            if (playAgain==0) {
                play = false;
            }
        }
        
        System.out.println("Your score: " + score);
        sc.close();
    }
}
