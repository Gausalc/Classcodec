public class Test{
	
	public static void main(String[] args){
		int num = 1;
		int i = 0;
		for (num=1;num<101;num++){
			for (i=2;i<num;i++){
			if (num%i==0){
				break;
			}if (num==i){
				System.out.println(num);
			    }
		    }
	    }
	}
}