package Geekster;

import java.util.Scanner;

public class Check_even_or_odd {
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner i= new Scanner(System.in);
        int  val=i.nextInt();
        if (val % 2 == 0)
        {
            System.out.println(val + " is enen number");
        }
        else {
            System.out.println(val + "is an odd number");
        }
        }
        /*
        if (val%2 != 0)
        {
            System.out.println(val + " is odd number");
        }

         */
    }

