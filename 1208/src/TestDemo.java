
import java.util.*;

public class TestDemo {

    public static List<Character> func(String str1,String str2){
        List<Character> ret = new ArrayList<>();
        for (int i = 0; i <str1.length() ; i++) {
            //判断STR2中是否包含STR1的某个字符
            char ch = str1.charAt(i);
            if (str2.contains(ch+"")){
                ret.add(ch);
            }
        }
        return ret;
    }

    public static void main2(String[] args) {
        List<Character> list = func("welcome to bit","come");
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("GSU","WUBAN",10.0));
        list.add(new Student("ZQY","WUBAN",11.0));
        list.add(new Student("ZZZ","WUBAN",12.0));
       // System.out.println(list);
        //foreach方法
        for(Student student:list){
            System.out.println((student));
        }
    }
}
class Student {
    public String name;
    public String Class;
    public double grade;

    public Student(String name, String Class, double grade) {
        this.name = name;
        Class = Class;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Class='" + Class + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}