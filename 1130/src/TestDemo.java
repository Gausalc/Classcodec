import java.util.Scanner;

public class TestDemo {
    public static String reverse(String str,
                                 int start,int end) {
        char[] array = str.toCharArray();
        while (start < end) {
            char tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;
            start++;
            end--;
        }
        return String.copyValueOf(array);
    }

    public static String func1(String str,int k) {
        if(str == null || k <= 0 || str.length() ==0) {
            return null;
        }
        str  = reverse(str,0,k-1);
        str  = reverse(str ,k,str.length()-1);
        str  = reverse(str ,0,str.length()-1);

        return str;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int k = scan.nextInt();
            String str = scan.next();
            String ret = func1(str,k);
            System.out.println(ret);
        }
    }
}