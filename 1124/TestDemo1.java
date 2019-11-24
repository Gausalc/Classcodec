import java.util.Arrays;

class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int score;

    public Student(String name, int age,int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public String toString(){
        return "["+ this.name+","+this.age+","+this.score+"]";
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("aaa",111,333);
        students[1] = new Student("bbb",333,222);
        students[2] = new Student("ccc",222,111);
        Arrays.sort();

    }
}
