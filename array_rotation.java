// class Solution {
//     void leftRotate(long a[], int k,int n) {
//         for(int i = 0; i < k; i++) {
//             this.rotate(a , k , n);
//         }
//     }
//     void rotate(long a[] , int k, int n) {
//         long temp = a[0];
//         for(int i = 0; i < n-1; i++) {
//             a[i] = a[i+1];     
//         }
//         a[n-1] = temp;
//     }
// }


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
