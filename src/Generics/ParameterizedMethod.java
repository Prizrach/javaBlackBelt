package Generics;

import java.util.ArrayList;

public class ParameterizedMethod {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("sd");
        al2.add("sd2");
        al2.add("sd3");
        String s = GenMethod.getSecondElement(al2);
        System.out.println(s);

    }
}


class GenMethod{
    public static <T > T getSecondElement(ArrayList<T> a1){
        return a1.get(1);
    }
}