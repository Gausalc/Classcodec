/*
//01 年龄
import java.util.Scanner;
public class Test{

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个你想判断的数:");
        int a = sc.nextInt();
		if (a <= 18 && a > 0) {
			System.out.println("少年");
		}else if (a >18 && a<29) {
			System.out.println("青年");
		}else if (a >=29 && a < 56) {
			System.out.println("中年");
		}else if (a >= 56) {
			System.out.println("老年");
		}else {
			System.out.println("输入错误");
		}
	}
}

//02 判断是否是素数
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要判断的数字");
		int num = sc.nextInt();
		int i = 0;
		if (num < 2) {
			System.out.println("不是素数");
		}else if (num == 2) {
			System.out.println("是素数");
		}else {
			for(i = 2;i < num; i++){
				if(num % i == 0) {
					System.out.println("不是素数");
					break;
				} else if (i == (num - 1)) {
					System.out.println("是素数");
					break;
				}
			}
		}
	}
}
/*
//03 1-100素数
public class Test {

    public static void main(String[] args){
        for (int i = 2 ;i < 101;i++){
            if (func(i)) {
                System.out.println(i+" ");
            }
        }
    }

    public static boolean func(int num ){
        for (int i =2;i < num ;i++){
            if ( num % i == 0){
                return false;
            }
        }return true;
    }
}


//04 1000-2000之间所有闰年
public class Test{

    public static void main(String[] args){
        for(int year = 1000; year <= 2000;year++){
            if (year % 100 != 0){
                if (year % 4 == 0){
                    System.out.println(year+"是闰年");
                }
            }else if (year % 400 == 0){
                System.out.println(year+"是大闰年");
            }
        }
    }
}


//05 乘法口诀表
public class Test{

    public static void main(String[] args){
        for (int i = 1;i <= 9;i++){
            for (int j = 1;j <= i;j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
            System.out.println( );
        }
    }
}


//06 最大公约数
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

//07   1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
public class Test{

    public static void main(String[] args){
        double n = 1.0;
        double sum = 0;
        double sum1 = 1.0;
        double sum2 = 1.0;
        while(n <= 100){
            if (n % 2 != 0){
                sum1 += (1 / n);
            }else {
                sum2 += (1 / n);
            }
            n++;
        }
        sum = sum1 - sum2;
        System.out.println(sum);
    }
}

//08   1到 100 出现多少个数字9
public class Test{

    public static void main (String[] args){
        int count = 0;
        for (int i = 1; i < 100;i++ ){
            if (i % 10 == 9 ){
                count++;
            }
            if (i / 10 == 9 ){
                count++;
            }
        }
        System.out.println(count);
    }
}


//09 求出0～999之间的所有水仙花数并输出
public class Test{

    public static void main (String[] args){
        int count = 0;
        for(int i = 0 ;i < 1000;i++){
            int a = i / 100;
            int b = (i % 100) / 10;
            int c = i % 10;
            int sum = a*a*a+b*b*b+c*c*c;
            if (sum == i){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("水仙花数的个数为"+ count);
    }
}


//10 编写代码模拟三次密码输入的场景
import java.util.Scanner;
public class Test{

    public static void main (String[] args){
        System.out.println("欢迎来到用户登录系统，请输入密码！");
        int word = 123;
        for (int i = 1;i <= 3;i++){
            System.out.println("密码：");
            Scanner sc = new Scanner(System.in);
            int password = sc.nextInt();
            if (word == password){
                System.out.println("登录成功");
                break;
            }
            else{
                System.out.println("失败，您还有"+(3-i)+"次机会！");
            }
            sc.close();
        }
    }
}


//11 写一个函数返回参数二进制中 1 的个数
public class Test{

    public static int func(int num){
        int count = 0 ;
        while(num > 0){
            if ((num & 1 )== 1){
                count++;
            }
            num = num>>1;
        }
        return count;
    }
    public static void main (String[] args){
        int i =15;
        int j = func(i);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(j);
    }
}


//12  获取一个数二进制序列中所有的偶数位和奇数位,分别输出二进制序列
public class Test{
    public static void main(String[] args) {
        int num = 17;
        int[] arr1={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//偶数
        int[] arr2={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//奇数
        int j=0;
        for(int i=0;i<32;i+=2){
            arr1[j]=(num>>i) & 1;
            j++;//偶数
        }
        j=0;
        for(int i=1;i<32;i+=2){
            arr2[j]=(num>>i) & 1;
            j++;//奇数
        }
        for(int i=15;i>=0;i--){
            System.out.print(arr1[i]);
        }
        System.out.println("");
        for(int i=15;i>=0;i--){
            System.out.print(arr2[i]);
        }
    }
}



//13 输出一个整数的每一位
public class Test{

    public static void every(int num) {
        if(num > 9) {
            every(num/10); //递归
        }
        System.out.print(num%10 + " ");
    }
    public static void main(String[] args){
        every(1234);
    }
}


//14 猜数字游戏
import java.util.Random;
import java.util.Scanner;
public class Test{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randNum = rand.nextInt(100)+1;

        while(true) {
            System.out.println("输入你要猜的数字：");
            int num = scan.nextInt();
            if(num > randNum) {
                System.out.println("大了");
            }else if (num == randNum) {
                System.out.println("猜对了");
                break;
            }else {
                System.out.println("小了");
            }
        }
        scan.close();
    }
}
*/