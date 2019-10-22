//中文的注释
/*

*/
//类名：采用大驼峰形式 HelloWorld
class HelloWorld {
	
}

public class Test {
	
	public static void main(String[] args) {
		
		
		
		/*
		short s = 10;
		char c = (char)s;
		
		char c2 = 9;
		short s2 = (short)c2;
		
		
		
		
		byte a = 10;
		byte b = 20;
		
		byte c = (byte)(a+b);
		System.out.println(c);
		
		
		
		//算术转换-》小类型和大类型进行运算的时候
		//提升为较大的类型进行运算
		
		int a = 10;
		long b = 99L;
		
		int c = (int)(a+b);
		System.out.println(c);
		
		
		//boolean   不可以和其他类型之间进行转换
		int a = 10;
		boolean b = true;
		
		//a = b;
		//b = a;
		
		
		int a = 10;//4
		double b = 20.0;//8
		
		//b = a;//小-》大  隐式的转换
		a = (int)b;//   必须强制类型转换
		
		
		//final int a = 10;
		final int a;
		a = 99;
		//a = 100; error 
		System.out.println(a);
		
		
		int c = 99;
		c = 100;
		
		System.out.println(c);
		
		const int a = 10;
		*/
		
		
		/*
		int maxNum = 10;//小驼峰
		
		
		int a$1 = 10;
		System.out.println(a$1);
		//下划线不可以单独的作为变量的名字出现
		int _a = 99;
		int ________a = 199;
		System.out.println(_a);
		System.out.println(________a);
		*/
	}
	
	
	public static void main2(String[] args) {
		
		{
			//局部变量   在方法体内
			int a = 10; // 一定要被初始化
			System.out.println(a);
			//作用域：当前变量所在的花括号体内
		}
		
		//System.out.println(a);
	}
	
	
	public static void test() {
		/*
		字符类型
		char ch1 = 'A';
		char ch2 = '高';
		System.out.println(ch1);
		System.out.println(ch2);
		
		//字节类型   -128 - 127   1个字节
		//byte  类型--》对标的是 C语言里面的char 
		byte b = 128;
		System.out.println(b);
		//System.out.println(Byte.MAX_VALUE);
		//System.out.println(Byte.MIN_VALUE);
		*/
		//2个字节  16    15  (-2^15 -- 2^15 -1)  
		
		/*
		short sh = 10;
		System.out.println(sh);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		*/
		//C语言：非0为真     0为假
		//JAVA boolean : 表示真和假 
		
		/*
		boolean bool = true;
		boolean bool2 = false;
		
		System.out.println(bool);
		System.out.println(bool2);
		
		//定义一个字符串类型变量  str  
		String str = "\'Java20!666\'";
		System.out.println(str);
		
		//    "Java20!666"
		//\t  制表符    tab					
		String str2 = "e:\\test.java";
		System.out.println(str2);
		
		//strcat 
		String str1 = "hello";
		String str2 = "bit";
		String str3 = str1+str2;
		System.out.println(str3);
		
		String str4 = "hello"+" "+"JAVA20";
		System.out.println(str4);
		
		int a = 10;
		System.out.println("a = " + a);
		
		int b = 20;
		System.out.println(b + a);
		
		
		String str = "result = ";
		int a = 10;
		int b = 20;
		String result = str + a + b;
		System.out.println(result);
		
		
		int a = 10;
		int b = 20;
		System.out.println("a = " + a + ",b = " + b);
		*/
	}
}










