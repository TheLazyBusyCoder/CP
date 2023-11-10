class Solution {
    long sumOfSeries(long N) {
        long sum = ((long) N * (N + 1) / 2) * ((long) N * (N + 1) / 2);
        return sum;
    }
}

/*
[N * (N+1) / 2]^2
*/
