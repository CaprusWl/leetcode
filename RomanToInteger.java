class Solution {
    public int romanToInt(String s) {
        int[] num = new int[27];
        num['I' - 'A'] = 1;
        num['V' - 'A'] = 5;
        num['X' - 'A'] = 10;
        num['L' - 'A'] = 50;
        num['C' - 'A'] = 100;
        num['D' - 'A'] = 500;
        num['M' - 'A'] = 1000;
        int cur = num['I' - 'A'];
        int res = 0;
        int tmp = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            tmp = num[s.charAt(i) - 'A'];
            if (tmp >= cur) {
                cur = tmp;
                res += tmp;
            } else {
                res -= tmp;
            }
        }
        return res;
    }
}
