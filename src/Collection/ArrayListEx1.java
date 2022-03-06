package Collection;

import java.util.*;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        System.out.println(arrayList1);
        Collections.sort(arrayList1);
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<String>(200);
        arrayList2.add("Zaur");
        arrayList2.add("Ivan");

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
    }
}
