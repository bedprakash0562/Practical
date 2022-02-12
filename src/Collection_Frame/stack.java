package Collection_Frame;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> c=new Stack <Integer>();
        c.push(100);
        c.push(400);
        c.push(600);
        c.push(900);
        int d=c.peek();
        c.pop();
        int e=c.search(900);
        //c.pop();

        System.out.println(d+" "+e);
    }
}
