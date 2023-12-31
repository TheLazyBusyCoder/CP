class Solution {
    static int closestNumber(int N , int M) {
        int q = N / M;
        int n1 = M * q;
        int n2;
        if(N * M > 0) {
            n2 = M * (q + 1);
        } else {
            n2 = M * (q - 1);
        }
        if(Math.abs(N-n1) < Math.abs(N - n2)) {
            return n1;
        }
        return n2;
    }
};
