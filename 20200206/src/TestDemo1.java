//验证回文
class Solution1 {
    public boolean isPalindrome(String s) {
        if (s == null) return true;
        s = s.toLowerCase();
        int l = s.length();
        StringBuilder str = new StringBuilder(l);
        for (char c : s.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                str.append(c);
            }
        }
        return str.toString().equals(str.reverse().toString());
    }
}


class Solution2 {
    public int compress(char[] chars) {
        int size = 0;
        int count = 1;
        for (int i = 1; i <= chars.length; i++) {
            if (i == chars.length || chars[i] != chars[i - 1]) {
                if (count > 1) {
                    chars[size++] = chars[i - 1];
                    char[] chs = String.valueOf(count).toCharArray();
                    for(char ch: chs){
                        chars[size++] = ch;
                    }
                    count = 1;
                } else {
                    chars[size++] = chars[i - 1];
                }
            } else {
                count++;
            }
        }
        return size;
    }
}
