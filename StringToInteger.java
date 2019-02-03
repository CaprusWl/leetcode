class Solution {
    public int myAtoi(String str) {
        int cur = 0;
        long res = 0;
        Boolean isNeg = false;
        
        if (str.length() == 0) {
            return 0;
        }
        
        while (str.charAt(cur) == ' ') {
            cur++;
            if (cur >= str.length())
                return 0;
        }
        
        if (str.charAt(cur) == '-') {
            isNeg = true;
            cur++;
        } else if (str.charAt(cur) == '+') {
            isNeg = false;
            cur++;
        } else if (str.charAt(cur) - '0' < 0 || str.charAt(cur) - '0' > 9) {
            return 0;
        }
        
        while (cur < str.length()) {
            if (str.charAt(cur) - '0' < 0 || str.charAt(cur) - '0' > 9) {
                if (isNeg) res = -1 * res;
                return (int)res;
            }
            res = res * 10 + (str.charAt(cur) - '0');
            if (isNeg == false && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (isNeg == true && -1 * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            cur++;
        }
        
        if (isNeg) res = -1 * res;
        
        if (res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        return (int)res;
    }
}
