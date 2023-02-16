package Generics;

import java.util.ArrayList;
import java.util.List;

public class AplicacaoGC {

    public static void main(String[] args) {

        List l = new ArrayList();
        l.add(5);
        l.add(10);
        l.add(15);

        System.out.println("Sem generics");

        for (Object o : l) {
            Integer s = (Integer) o;
            System.out.println(o);
        }
        System.out.println();

        System.out.println("Com generics");

        List<Integer> lg = new ArrayList<>();
        lg.add(20);
        lg.add(25);
        lg.add(30);

        for (Integer o : lg){
            System.out.println(o);
        }
    }
}
