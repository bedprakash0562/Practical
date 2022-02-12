package Collection_Frame;

import java.util.ArrayList;
import java.util.List;

public class array_list {
    public static void main(String[] args) {
        List<Integer> c=new ArrayList<>();
        c.add(10);
        c.add(100);
        c.add(1000);
        c.add(10000);
        c.add(100000);
        c.add(1000000);
        System.out.println(c);
        c.remove(2);
        c.get(3);
      // c.clear();// To  clear the whole list
       c.set(2,3000000);
        c.toArray();
       boolean f=c.contains(1000);
        System.out.println(c+" "+f);
        for (int i = 0; i <c.size() ; i++) {
            System.out.println(c.get(i));
        }
    }
}
