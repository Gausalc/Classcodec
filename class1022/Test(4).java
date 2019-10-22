

public class Test {
	
	//1234    1 2 3 4
	public static void func(int num) {
		
		if(num > 9) {
			func(num/10);
		}
		System.out.print(num%10 + " ");
	}
	
	//1+2+3+.....num  3
	public static int func2(int num) {
		if(num == 1) {
			return 1;
		}
		return num + func2(num-1);
		
	}
	
	//123
	public static int func3(int num) {
		
		if(num <= 9) {
			return num;
		}
		
		return num%10+func3(num/10);
		
	}
	
	//千万
	public static int fabonacio(int n) {
		
		if(n == 1 || n == 2) {
			return 1;
		}
		
		return fabonacio(n-1)+fabonacio(n-2);
	}
	//迭代   循环
	public static int fabonacio2(int n) {
		
		int f1 = 1;
		int f2 = 1;
		int f3 = 1;
		
		for(int i = 3;i <= n;i++) {
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
		}
		return f3;
		
	}
	
	//1    A->C   1
	//2    a->b   A->C   b->c   3
	//3  A->C  A->B  C->B A->C B->A B->C  A->C   7	
	//64  2^64-1  
	
	public static void move(char pos1,char pos2) {
		System.out.println(pos1 + "->" + pos2);
	}
	//pos1通过pos2移动到pos3
	public static void Hanota(int n,char pos1,char pos2,char pos3) {
		if(n == 1) {
			move(pos1,pos3);
		}
		else {
			Hanota(n-1,pos1,pos3,pos2);
			move(pos1,pos3);
			Hanota(n-1,pos2,pos1,pos3);
		}
	}
	
	public static int func4(int n) {
		
		if(n == 1 || n == 2) {
			return n;
		}
		
		int f1 = 1;
		int f2 = 2;
		int f3 = 0;
		for(int i = 3;i <= n;i++) {
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
		}
		return f3;
	}
	//-javaagent:D:\myidea\ideaIU-2018.1.5.win\bin\JetbrainsCrack-2.9-release-enc.jar
	
	public static void main(String[] args) {
		
		//Hanota(3,'A','B','C');
		
		System.out.println(func4(1));
		System.out.println(func4(2));
		System.out.println(func4(3));
		System.out.println(func4(4));
		System.out.println(func4(5));
	}
	
}

