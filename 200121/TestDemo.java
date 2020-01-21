/*import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] array1 = {1,3,5,9};
        int[] array2 = {2,4,6,8};
        int[] ret = func(array1, array2);
        System.out.println(Arrays.toString(ret));
    }
    private static int[] func(int[]array1,int[]array2){
        int[] array = new int[array1.length+array2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<array1.length && j<array2.length){
            if (array1[i]<array2[j]){
                array[k++] = array1[i++];
            }else{
                array[k++] = array2[j++];
                j++;
            }
        }
        while(i < array1.length){
            array[k++] = array1[i++];
        }
        while(j < array1.length){
            array[k++] = array2[j++];
        }
        return array;
    }
}*/
