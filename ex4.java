
/**
 * Write a description of class ex4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ex4
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charter to print: ");
        String char1=sc.nextLine();
        System.out.println("How many times to print: ");
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
        System.out.print(char1);
    }
}
}
