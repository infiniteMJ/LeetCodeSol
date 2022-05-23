class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverseX = 0;
        int tmp = x;

        while (x != 0) {
            int res = x % 10;
            reverseX = reverseX * 10 + res;
            x /= 10;
        }

        return tmp == reverseX;

    }
}
