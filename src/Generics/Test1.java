package Generics;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("Hello"));
//        list.add(new Car());

        list.add("hello");
        list.add("bye");
        list.add("pshel na");
        list.add("sorry");

        for (String s: list){
            System.out.println(s + " length " + s.length());
        }

    }
}

class Car{}
