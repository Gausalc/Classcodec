public class Text{
	
	public static void main(String[] args){
		int num = 5;
		int sum = 0;
		int ret = 1;
		for(int i = 1;i<= num;i++){
			ret = 1;
			for(int j =1; j<= i;j++){
				ret *= j;
			}
			sum += ret;
		}
		System.out.println(sum);
	}
}