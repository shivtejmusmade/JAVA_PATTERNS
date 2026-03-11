/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
import java.util.Scanner;

public class A8DiamondPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many rows do you want : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++)
        {
            for(int j = i; j < row; j++)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2*i - 1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = row-1; i >= 1; i--)
        {
            for(int j = row; j > i; j--)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= (2*i - 1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}