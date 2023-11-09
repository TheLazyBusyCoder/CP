class Solution {
    int getOddOccurrence(int[] arr, int n) {
        int[] a = new int[100000];
        for(int i =0;i<n;i++){
            a[arr[i]]++;
        }
        for(int i = 0;i<=100000;i++) {
            if(a[i]%2!=0){
              return i;
            }
        }
        return -1;
    }
}
