import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main ma = new Main();
        int len = ma.getCommen(sc.next(),sc.next());
        System.out.println(len);
    }
    public int getCommen(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1 == null ||str2 ==null  ||str1.length() == 0|| str2.length() == 0){
            return 0;
        }
        int len1 = str1.length();
        int len2 = str2.length();

        String min = null;
        String max = null;
        String target = null;
        min = len1 <= len2 ?str1:str2;
        max = len1 > len2 ?str1:str2;
        for (int i = min.length(); i >= 1; i--) {
            for (int j = 0; j <=min.length()-1 ; j++) {
                target = min.substring(j,j+1);
                for (int k = 0; k <max.length()-1 ; k++) {
                    if (max.substring(k,k+i).equals(target)){
                        return i;
                    }
                }
            }
        }
        return 0;
    }
}
