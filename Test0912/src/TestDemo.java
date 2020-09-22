import java.util.*;
public class TestDemo {
    public static boolean huiwen(String s){
        boolean flag = true;
        int len = s.length();
        for (int i = 0; i < len/2; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(len-1-i);
            if(c1!=c2){
                flag = false;
                break;;
            }

        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();

        int count = 0;
        for (int i = 0; i <str1.length(); i++) {
            StringBuilder sb = new StringBuilder(str1);
            sb.insert(i,str2);
            if(huiwen(sb.toString())){
                System.out.println(sb);
                count++;
            }
        }
        System.out.println(count);
    }
}
