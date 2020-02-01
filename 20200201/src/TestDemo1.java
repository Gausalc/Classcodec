//变小写
class Solution1 {
    public String toLowerCase(String str) {
        String res = "";
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            if (ch>='A'&& ch<= 'Z'){
                ch = (char)(ch+32);
            }
            res += ch;
        }
        return res;
    }
}
//右移k个位置 （旋转）
class Solution2 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

//原地移除所有数组等于val的元素
class Solution3 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0){
            return 0;
        }
        int i= 0;
        for (int j = 0; j <nums.length ; j++) {
            if (nums[j] != val){
                nums[i] =nums[j];
                i++;
            }
        }
        return i;
    }
}

//搜索插入位置
class Solution4 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}



