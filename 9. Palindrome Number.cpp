class Solution {
public:
    bool isPalindrome(int x) {
    if (x < 0) {
        return false;
    } else if (x < 10) {
        return true;
    } else if (x % 10 == 0) {
        return false;
    }
    int max = 1;
    while (x / max > 9) {
        max *= 10;
    }
    while (max >= 10 && x / max == x % 10) {
        x = x % max;
        x /= 10;
        max /= 100;
    }
    return max < 10;
}
};
