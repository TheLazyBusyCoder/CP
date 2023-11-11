class Solution {
    static int max_size;
    static long dp[];
    static long mod;
    Solution() {
        mod = 1000000000+7;
        max_size = 100000;
        dp = new long[max_size];
        for(int i = 0; i < max_size; i++) {
            dp[i] = -1;
        }
    }
    static Long numberOfWays(int N) {
        if(dp[N] != -1) {
            return dp[N];
        }
        if(N<=2) {
            return dp[N] = N;
        }
        return dp[N] = (numberOfWays(N-1) % mod + numberOfWays(N-2) % mod) % mod;
    }
};
