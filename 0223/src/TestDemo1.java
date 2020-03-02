import java.util.*;
public class TestDemo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int m = 0;
            for(int i=0;i<a.length()+1;i++){
                String str = a.substring(0,i)+b+a.substring(i,a.length());
                StringBuffer sb = new StringBuffer(str);
                if(sb.reverse().toString().equals(str)){
                    m++;
                }
            }
            System.out.print(m);
        }
    }
    public int findKth(int[] a, int n, int K) {
        // write code here
        return sortUseQuickSort_C(a,0,n-1,K);
    }
    private int sortUseQuickSort_C(int[] a, int p, int r, int k) {
        int q = partition(a,p,r,k);
        if(q+1 == k ) return a[q];
        else if(q+1 > k) return sortUseQuickSort_C(a,p,q-1,k);
        else return sortUseQuickSort_C(a,q+1,r,k);
    }

    private int partition(int[] a, int p, int r, int k) {
        int pivot = a[r];
        int i = p;
        int j = p;
        for(; j< r; j++) {
            if(a[j] > pivot) {
                if(i ==j) {
                    i++;
                } else {
                    swap(a,i,j);
                    i++;
                }
            }
        }
        swap(a,i,r);

        return i;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}



