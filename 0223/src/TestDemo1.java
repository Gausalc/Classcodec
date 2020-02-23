import java.util.HashSet;
import java.util.Scanner;

    public class TestDemo1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int f1 = 0;
            int f2 = 1;
            int f3 = 0;
            while(f2 < n){
                f3 = f1+f2;
                f1 = f2;
                f2 = f3;
            }
            if (Math.abs(f2 - n) > Math.abs(f1 - n)) {
                System.out.println(Math.abs(f1 - n));
            } else {
                System.out.println(Math.abs(f2 - n));
            }
        }

        public static void main1(String[] args) {
            Scanner in = new Scanner(System.in);
            HashSet<String> set = new HashSet<>();

            while (in.hasNext()) {
                String str = in.nextLine();
                String arr[] = str.split(" ");
                for(int i=0; i<arr.length; i++){
                    set.add(arr[i]);
                }
            }

            System.out.println(set.size());
        }
}