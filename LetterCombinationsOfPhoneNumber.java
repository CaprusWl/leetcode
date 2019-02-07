class Solution {
    public List<String> letterCombinations(String digits) {
    
        String[] digit = new String[10];
        digit[2] = "abc";
        digit[3] = "def";
        digit[4] = "ghi";
        digit[5] = "jkl";
        digit[6] = "mno";
        digit[7] = "pqrs";
        digit[8] = "tuv";
        digit[9] = "wxyz";
        
        List<String> resList = new ArrayList<>();
        if (digits.length() == 0)
            return resList;
        
        combine(0, digits, resList, new String(), digit);
        return resList;
    }
    
    private void combine(int index, String digits, List<String> resList, String str, String[] digit) {
        if (index == digits.length())
            resList.add(str);
        else {
            for (int i = 0; i < digit[digits.charAt(index) - '0'].length(); i++) {
                combine(index + 1, digits, resList, str + digit[digits.charAt(index) - '0'].charAt(i), digit);
            }
        }
    }
}
