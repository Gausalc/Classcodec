public class Test{
	
	public static void main(String[] args){
		int a = 20;
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