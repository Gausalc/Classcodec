import java.util.Scanner;

public class Test{

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个正整数");
        int a = sc.nextInt();
        System.out.println("请输入第二个正整数");
        int b = sc.nextInt();
        System.out.println(a+"和"+b+"的最大公约数是"+Gys(a,b));
    }

    public static int Gys(int x,int y){
        int num = 1;
        for (int i =1; i <= x;i++){
            if (x % i == 0 && y % i == 0){
                num = i;
            }
        }
        return num;
    }
}