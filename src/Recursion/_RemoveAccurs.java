package Recursion;

import java.util.Scanner;

public class _RemoveAccurs {
    public static String remove(String str) {
        if (str.length() == 0) {
            return str;
        }
        String ans = " ";
        Scanner sc=new Scanner(System.in);
        if (str.charAt(0) != 'a') {
            ans = ans + str.charAt(0);
        }
        return ans + remove(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your String: ");
        String str= sc.next();

       str= remove(str);
        System.out.println(str);

    }
}
