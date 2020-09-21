import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] array = s.toCharArray();
        int length= s.length();
        int count = 1;

        for (int i = 0; i <length -1 ; i++) {
            if (array[i]== array[i+1]){
                count++;
            }
            if (array[i]!= array[i+1]||i==length-2){
                System.out.print(count);
                System.out.print(array[i]);
                count = 1;
            }
        }
        if (array[length-2]!=array[length-1]){
            System.out.print("1"+array[length-1]);
        }
    }
}

/*public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        getNum(string);
    }
   /* public static void getNum(String string){
        StringBuilder sb = new StringBuilder();
        char a = string.charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char b = string.charAt(i);
            if (b == a){
                count++;
                a=b;
            }else{
                if (count > 1){
                    sb.append(count);
                    sb.append(a);
                    count = 0;
                    a=b;
                }else {
                    sb.append(a);
                    a=b;
                }
            }
            a = b;
        }
        if (count > 1){
            sb.append(count);
            sb.append(a);
        }
        sb.append(a);
        System.out.println(sb.toString());
    }
}*/
