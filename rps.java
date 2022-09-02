package programming;
import java.util.Scanner;

public class varrand {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        //input numbers
        System.out.println("Game!!");
        System.out.println("1. Rock\n2. Scissors\n3. Paper");
        System.out.print("\nChoose one!\nPlayer =  ");
        int a = in.nextInt();
        
        //no choice
        if (a > 3) {
            System.out.println("There's no choice");
        }
        
        if (a <= 3 && a > 0) {
            //BOT picks random numbers
            int b = (int) (Math.random()*3)+1;
            System.out.println("BOT = "+b);
            
            //You Win
            if (a == 2 && b == 3) {
                System.out.println("You Win!");
            } else if (a == 1 && b == 2) {
                System.out.println("You Win!");
            } else if (a == 3 && b == 1) {
                System.out.println("You Win!");
            }
            
            //You Lose
            if (a == 1 && b == 3) {
                System.out.println("You Lose");
            } else if (a == 3 && b == 2) {
                System.out.println("You Lose");
            } else if (a == 2 && b == 1) {
                System.out.println("You Lose");
            }
            
            //Draw
            if (a == 1 && b == 1) {
                System.out.println("Draw!");
            } else if (a == 2 && b == 2) {
                System.out.println("Draw!");
            } else if (a == 3 && b == 3) {
                System.out.println("Draw!");
            }
        }
    }
}
