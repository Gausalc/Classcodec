import java.util.Arrays;
/*
//数组作为返回值 将数组扩大二倍 要求不能修改原数组
class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ahh = transform(arr);
        array(ahh);
    }
    public static void array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] transform(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i] * 2;
        }
        return ret;
    }
}
/*
public class Test{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(toString(array));
    }

    public static String toString(int[] array) {
        String ahh = "[";
        for (int i = 0; i <array.length ; i++) {
            ahh = ahh + array[i];
            if (i != array.length-1) {
                ahh += ",";

            }
        }
        ahh += "]";
        return ahh;
    }
}


//求数组最小值
public class Test{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int min = findMin(array);
        System.out.println(min);
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

//求数组最大值
public class Test{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int max = findMax(array);
        System.out.println(max);
    }

    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}right

//求数组的平均数
public class Test{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(avg(arr));
    }
    public static double avg(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return (double)sum / (double)arr.length;
    }
}
//逆置
public class Test{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
}
*/
//把奇数放在偶数的前面
public class Test{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        eveAfterOdd(array);
        System.out.println(Arrays.toString(array));
    }

    public static void eveAfterOdd(int[] array) {
        int i = 0;
        int j = array.length-1;
        while (i < j) {
            while (i < j && array[i] % 2 != 0) {
                i++;
            }//i所保存的下标就是偶数的下标
            while (i < j && array[j] % 2 == 0) {
                j--;
            }//j所保存的下标就是奇数的下标
            if(i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
    }
}
//二分法  forindex toindex  左闭右开
/*
public class Test{

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int ahh = binarySearch(array,3,0,array[array.length-1]);
        System.out.println(ahh);
    }
    public static int binarySearch(
            int[] array,int key,int left,int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) >> 1;
        if (array[mid] == key) {
            return mid;
        }else if(array[mid]>key){
            return binarySearch(array, key, left, mid-1);
        }else{
            return binarySearch(array, key, mid+1,right);
        }
    }
}

//冒泡排序
public class Test{

    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array){
        boolean thing = true;//判断
        for (int i = 0; i <array.length-1 ; i++) {//趟数
            thing = true; //每一趟都有可能
            for (int j = 0; j <array.length-1-i ; j++) {//次数
                if(array[j]>array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    thing = false;
                }
            }
            if(thing){
                break;
            }
        }
    }

}
*/
