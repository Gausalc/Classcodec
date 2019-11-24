//1.implements Cloneable
//2.重写clone：Object
//3.如果当前类包含了引用类型   Person ->Money  在Person的clone方法内，不仅要克隆自己本身 还需要克隆Money

class Money implements Cloneable{
    double money = 12.5;

    //重写clone：Object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    //空接口为什么？  // 标记接口 将来可以被克隆
    public String name;
    public Money m;

    public Person(String name, Money m) {
        this.name = name;
        this.m = m;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person per = (Person) super.clone();
        per.m = (Money) this.m.clone();
        return
    }
}
public class TestDemo2 {
    public static void main(String[] args)throws CloneNotSupportedException{
        Person person = new Person("aa");
        person.name = "aa";
        Person person1 = (Person) person.clone();
        System.out.println(person1.name);
    }
}
