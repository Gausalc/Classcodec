public class Test{
	
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = 30;
		int max;
		int min;
		if (a > b) {
			max = a;
			min = b;
			if (b > c) {
				min = c;
			} else if(c > a) {
				max = c;
			}
			
		} else {
			max = b;
			min = a;
			if (a > c) {
				min = c;
			} else if(c > b) {
				max = c;
			}
		}
		System.out.println("max="+max+" "+"min="+min);
	}
}