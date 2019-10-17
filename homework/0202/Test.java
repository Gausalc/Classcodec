public class Test{
	
	public static void main(String[] args){
		int num = 2;
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