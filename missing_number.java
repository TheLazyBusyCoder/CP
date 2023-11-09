class Compute {
    public static int missingNumber(int A[], int N)
    {
        int T = N+1;
        int sum = (T * (T-1) )/ 2;
        int fsum = A[0];
        for(int i =1; i < N-1; i++) fsum+=A[i];
        return sum - fsum;
    }
}
