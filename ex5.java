
/**
 * Write a description of class ex5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ex5
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charter to print: ");
        String char1=sc.nextLine();
        System.out.println("How many tall to print: ");
        int t=sc.nextInt();
        for(int i=0;i<=t;i++){
            for(int j=0;j<=i;j++){
                System.out.print(char1);
            }
            System.out.println();
}
}
}
