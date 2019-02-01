class LongsestSubstring{
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char c;
        int res = 0, cur = 0;
        int startPosition = 0, lastPosition = 0;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (map.containsKey(c) && (lastPosition = map.get(c)) >= startPosition) {
                cur = i - lastPosition;
                startPosition = lastPosition + 1;
            } else {
                if (++cur > res) {
                    res = cur;
                }
            }
            map.put(c, i);
        }
        return res;
    }
}
