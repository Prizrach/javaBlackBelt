package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Kolya");

        Iterator<String> iter = arrayList1.iterator();


        while (iter.hasNext()){
            iter.next();
            iter.remove();
        }


        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
