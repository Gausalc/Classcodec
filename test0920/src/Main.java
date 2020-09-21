import  java.util.*;
public class Main {
    public static void getA1(){
        List<String> a = new ArrayList<>();
        a.add("haha");
        List<String> a1 = a;
        a.add("hehe");
        System.out.println(a1);
    }

    public static void main(String[] args) {
        getA1();
    }
}
