
/**
 * Write a description of class ex7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ex7
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("I got a number! Try and guess: ");
        int t = (int) (Math.random()*100) + 1;
        int g=0;
        int tries=1;
        while(t!=g){
            System.out.println("Whats your guess?");
            g=sc.nextInt();
            if(g>t){
                System.out.println("Your guess is too high!");
                tries++;
            }else if(g<t){
                System.out.println("Your guess is too low!");
                tries++;
            }
            else{
                System.out.println("You guessed Correctly!");
                System.out.println("It took you "+ tries + " tries.");
        }
    }
}
}
