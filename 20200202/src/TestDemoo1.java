//赎金信
class Solution1 {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder stringBuilder = new StringBuilder(magazine);
        int index;
        if (magazine.length() < ransomNote.length()) return false;
        for (char c : ransomNote.toCharArray()) {
            index = stringBuilder.indexOf(String.valueOf(c));
            if (index >= 0) {
                stringBuilder.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return true;
    }
}

//回文数
class Solution2 {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int cur = 0;
        int num = x;
        while(num != 0) {
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        return cur == x;
    }
}

//最后一个单词的长度
class Solution3 {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while(end >= 0 && s.charAt(end) == ' ') end--;
        if(end < 0) return 0;
        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') start--;
        return end - start;
    }
}

//合并两个有序数组
class Solution4 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n;
        int len1 = m - 1;
        int len2 = n - 1;
        for (int k = len - 1; k >= 0; k--) {
            if (len1 == -1) {
                System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
                break;
            } else if (len2 == -1) {
                break;
            } else if (nums1[len1] >= nums2[len2]) {
                nums1[k] = nums1[len1];
                len1--;
            } else {
                nums1[k] = nums2[len2];
                len2--;
            }
        }
    }
}
