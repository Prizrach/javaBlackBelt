package Collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add(0, "Misha");
        for (String s : arrayList1) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
        arrayList1.set(0, "Masha");

        System.out.println(arrayList1);

        System.out.println(arrayList1.remove(1));

    }

}
