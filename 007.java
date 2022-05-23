class Solution {
    public int myAtoi(String s) {
        
        int res = 0;
        int sign = 1;
        char[] chs = s.toCharArray();

        int i = 0;
        while (i < chs.length && chs[i] == ' ') {
            i++;
        }

        if (i < chs.length && (chs[i] == '+' || chs[i] == '-')) {
            sign = chs[i++] == '-' ? -1 : 1;
        }

        while (i < chs.length && chs[i] >= '0' && chs[i] <= '9') {
            int digit = chs[i++] - '0';

            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = 10 * res + digit;
        }

        return res * sign;
        
    }
}
