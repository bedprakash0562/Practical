package Recursion;

import java.util.Scanner;

public class FindPower {
    public static int pow(int x,int n) {
        if (n == 0) {
            return 1;
        }else
            return x*pow(x,n-1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Values Of X And N:");
        int x= sc.nextInt();
        int n= sc.nextInt();
        System.out.println(pow(x,n));



        }
}
