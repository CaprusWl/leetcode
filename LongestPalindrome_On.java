class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1)
            return s;
        int left = 0, right = 0, maxLen = 0;
        String res = null;
        char cur;
        for (int i = 0; i < s.length(); i++) {
            left = i;
            right = i;
            cur = s.charAt(i);
            while (right < s.length() && s.charAt(right) == cur) {
                right++;
            }
            i = --right;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            left++;
            right--;
            if (maxLen < right - left + 1) {
                maxLen = right - left + 1;
                res = s.substring(left, right + 1);
            }
        }
        return res;
    }
}
