package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {



        List<?> list = new ArrayList<String>();
//        list.add("hello");

        List<? extends Number> list30 = new ArrayList<Integer>();


        List<Double> list1 = new ArrayList<>();
        list1.add(3.15);
        list1.add(6.854);
        showListInfo(list1);
        List <String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("hello");
        list2.add("by");
        showListInfo(list2);

        ArrayList <Double> arrayList = new ArrayList<>();
        arrayList.add(6.12);
        arrayList.add(6.15);
        arrayList.add(6.16);
        System.out.println(summ(arrayList));

    }
    static void showListInfo(List<?> list){
        System.out.println("My list contains the following elements: " + list);
    }

    public static double summ(ArrayList<? extends Number> list){
        double summ =0;
        for (Number n : list){
            summ+=n.doubleValue();
        }
        return summ;
    }

}


