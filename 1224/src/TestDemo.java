public class TestDemo {

    /**
     *时间复杂度：
     *最坏：O(n^2)
     *最好：O(n)-->有序的时候 当数据越有序越快
     *空间复杂度：O(1)
     *稳定性：稳定的排序
     * @param array
     */
    public static void insertSort(int [] array){
        for (int i = 1; i <array.length;i++) {
            int tmp = array[i];
            int j = 0;
            for (j = i-1; j >= 0; j++) {
                if (array[j] > tmp) {
                    array[j + 1] = array[i];
                }else{
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }
    /**
     *时间复杂度：
     *最坏：O(n^1.3-1.5)
     *最好：O(n)-->有序的时候 当数据越有序越快
     *空间复杂度：O(1)
     *稳定性：不稳定的排序
     * @param array
     */

    /**
     *selectSort
     */
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int max = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            int tmp = array[max];
            array[max] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }

}
