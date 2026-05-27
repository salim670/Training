import java.util.Scanner;
public class gues {
    public static void main(String[] args) {
        int secret=33;
        int guess;
        do {
            System.out.println("Enter your guess:");
            Scanner sc=new Scanner(System.in);
            guess=sc.nextInt();
            if(guess<secret)
            {
                System.out.println("Too low! Try again.");
            }
            else if(guess>secret)
            {
                System.out.println("Too high! Try again.");
            }
        } while (guess != secret);
        System.out.println("Congratulations! You guessed the number.");
    }
    
}
