package Generics;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info <String> info = new Info<>("Hello");
//        System.out.println(info);
//
//        Info <Integer> info1 = new Info<>(12);
//        System.out.println(info1);
//
//        Info <Bus> info2 = new Info<>(new Bus());
//        System.out.println(info2);
//        info2.getValue();
//
//        Integer i = info1.getValue();

    }

//    public void abc (Info <String> info){
//        String s = info.getValue();
//    }
//
//    public void abc (Info <Integer> info){
//        Integer i = info.getValue();
//    }



}

class Info <T extends Number&I1&I2>{
    private T value;

    public Info (T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue(){
        return value;
    }

}

interface I1{}

interface I2{}

//class Parent{
//    public void abc (Info <String> info){
//        String s = info.getValue();
//    }
//}
//
//class Child extends Parent{
//    public void abc (Info <Integer> info){
//        Integer i = info.getValue();
//    }
//}

class Bus{
    @Override
    public String toString() {
        return "Bus{}";
    }
}