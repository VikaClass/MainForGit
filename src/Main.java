import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 42;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(105);
        list.add(10);
        list.add(8);
        list.add(26);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
        }
    }





/*    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 42;
        int [] bella = new int[10];
        for (int i = 0; i < bella.length; i++) {
            bella [i] = i+1;

        }

        //

        for (int i = 0; i < bella.length; i++) {
            if (bella [i] % 2 == 0) {
                System.out.println(bella[i]); }
        }
    }*/

}
