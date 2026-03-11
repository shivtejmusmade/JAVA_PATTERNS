/*
    * * * * * 
    * * * *
    * * *
    * *
    *
*/
import java.util.Scanner;

public class A5InvertedLeft {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many rows do you want : ");
        int row = sc.nextInt();

        for(int i = row; i >= 1; i--)
        {
            for(int k = 1; k <= i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
