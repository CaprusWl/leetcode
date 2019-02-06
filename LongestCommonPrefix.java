class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int pos = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
                pos = i;
            }
        }
        int minLength = Integer.MAX_VALUE, count = 0;
        for (int i = 0; i < strs.length; i++) {
            count = 0;
            for (int j = 0; j < strs[pos].length(); j++) {
                if (strs[pos].charAt(j) != strs[i].charAt(j)) {
                    break;
                }
                count++;
            }
            if (count == 0) {
                return "";
            }
            if (minLength > count) {
                minLength = count;
            }
        }
        return strs[pos].substring(0, minLength);
    }
}
