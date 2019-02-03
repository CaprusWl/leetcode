/*class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int x1 = x;
        int y = 0;
        while (x != 0) {
            y = y * 10 + (x % 10);
            x /= 10;
        }
        return y == x1;
    }
}*/

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        String s = String.valueOf(x);
        int n = s.length();
        for (int i = 0; i <= (n - 1) / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
