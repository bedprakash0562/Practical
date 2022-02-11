package Recursion;

public class Factorial {
    public static void fact(int n,int ans){
        if(n==1){
            System.out.println(ans);
            return;
        }
        fact(n-1,ans*n);

    }
    public static void main(String[] args) {

        fact(5,1);
    }
}
