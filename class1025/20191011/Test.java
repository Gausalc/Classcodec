public class Test {
	
	public static void main(String[] args) {
		int sumOdd = 0;//奇数
		int sumEve = 0;//偶数
		for(int i = 1;i<101;i++){
			if (i%2 == 0){
				sumEve = sumEve + i ;
			}else{
				sumOdd = sumOdd + i ;
			}
		} 
		System.out.println(sumEve);
		System.out.println(sumOdd);
	}
}