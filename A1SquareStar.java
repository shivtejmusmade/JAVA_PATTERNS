/*
    * * * * *
    * * * * *
    * * * * *
    * * * * *
*/

import java.util.Scanner;

public class A1SquareStar
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many rows do you want : ");
        int row = sc.nextInt();    
        System.out.print("Enter How many columns do you want : ");
        int col = sc.nextInt();  

        for(int i = 1; i <= row ; i++)
        {
            for(int j = 1; j <= col ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
