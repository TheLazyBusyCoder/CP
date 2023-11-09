class Solution
{
    void leftRotate(long a[], int k,int n)
    {  
        if(k>=n) {
            if(k%n != 0){
                k = k % n;
                rotate(a,0,k-1);
                rotate(a,k,n-1);
                rotate(a,0,n-1);
            }
        } else{
              rotate(a,0,k-1);
              rotate(a,k,n-1);
              rotate(a,0,n-1);
        }
    }
    
    public static void rotate(long a[], int s, int e){
        while(s<e) {
            long temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }
}
