// O(max(n , m));
class Compute {
    int count(long arr[] , long n , long val) {
        int c = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == val) c++;
        }
        return c;
    }
    public String isSubset( long a1[], long a2[], long n, long m) {
        for(int i = 0; i < m; i++) {
            if(count(a2 , m , a2[i]) > count(a1 , n , a2[i])) {
                return "No";
            }
        }
        return "Yes";
    }
}
