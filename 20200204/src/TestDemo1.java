//按奇偶排序数组
class Solution1 {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int t = 0;
        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 0)
                ans[t++] = A[i];
        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 1)
                ans[t++] = A[i];
        return ans;
    }
}

//寻找数组的中心索引
class Solution2 {
    public int pivotIndex(int[] nums) {
        if (nums.length==0) return -1;
        int sum=0,sumTem=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(sumTem*2+nums[i]==sum){
                return i;
            }
            sumTem+=nums[i];
        }
        return -1;
    }
}

//加一
class Solution3 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if(digits[i]!=0)
                return digits;
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}

//第三大的数
class Solution4 {
    public int thirdMax(int[] nums) {
        int max = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int secondMax = Integer.MIN_VALUE;
        boolean a = false;
        for (int i = 0; i < len; i++) {
            if (nums[i] >= secondMax && nums[i] < max) {
                secondMax = nums[i];
                a = true;
            }
        }
        if (!a) {
            return max;
        }
        int thirdMax = Integer.MIN_VALUE;
        boolean b = false;
        for (int i = 0; i < len; i++) {
            if (nums[i] >= thirdMax && nums[i] < secondMax) {
                thirdMax = nums[i];
                b = true;
            }
        }
        if (!b) {
            return max;
        }
        return thirdMax;
    }
}
