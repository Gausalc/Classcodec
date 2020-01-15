public class TestDemo1 {
    public static void main(String[] args) {
        int[] array = {};

    }
    /**
     * 快速排序
     * 时间复杂度：O（nlog2n）
     * 空间复杂度：O(log2n)
     * 稳定性：不稳定
     * @param array
     * @return
     */
    public static int partion1(int[] array,int start,int end){
        int tmp = array[start];
        while(start< end){
            while(start <end && array[end]>= tmp){
                end--;
            }
            if (start >= end){
                break;
            }else{
                array[start] = array [end];
            }
            while((start< end) && array[end]<= tmp){
                start++;
            }
            if (start >= end){
                break;
            }
            else{
                array[start] = array [end];
            }
        }
        return tmp;
    }
    public static int partion(int[] array,int start,int end){
        int tmp = array[start];
        while(start < end){
            while((start<end) && array[end]>=tmp){
                end--;
            }
            if (start>=end){
                break;
            }else{
                array[start]= array[end];
            }
            while((start<end) && array[end]<=tmp){
                start++;
            }
            if (start>=end){
                break;
            }else{
                array[end]= array[start];
            }
        }
        array[start]= tmp;
        return tmp;
    }
    public static void quick(int[] array,int low,int high){
        if (low<high){
            int pivot = partion(array, low, high);
            quick(array, low, pivot-1);
            quick(array, pivot+1, high);
        }
    }
    public static void quickSort(int[] array){
        quick(array,0,array.length-1);
    }
    /**
     * 优化一：因为在排序的过程当中，数据会逐渐趋于有序。对于直接插入排序来说，数据越有序越快--》利用阈值
     * 优化二：三数取中法--》取三位数中间的中位数作为基准
     */
}

