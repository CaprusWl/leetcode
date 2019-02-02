class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String str = "";
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (isPalindrome(s.substring(j, i)) && i - j > maxLen) {
                    str = s.substring(j, i);
                    maxLen = i - j;
                }
            }
        }
        return str;
    }

    private Boolean isPalindrome(String str) {
        if (str == null || str.length() <= 1) {
            return true;
        }

        int i = 0;
        while (i < str.length() / 2) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
            i++;
        }

        return true;
    }
}
