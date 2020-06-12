public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if (n == 0) return 0;
        int ret = 0;
        for(int i = 0; i < 32; i++) {
            ret = ret * 2 + (n & 1);
            n = n >>1;
        }
        return ret;
    }
}
