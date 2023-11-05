class Solution {
  subarraySum(arr, n, s) {
    if (s == 0) return [-1];
    let left = 0;
    let right = 0;
    let sum = 0;

    while (right <= n) {
      if (sum === s) {
        return [left + 1, right];
      }
      if (sum < s) {
        sum += arr[right];
        right++;
      } else {
        sum -= arr[left];
        left++;
      }
    }

    return [-1];
  }
}

new Solution().subarraySum([1, 2, 3, 4, 5], 5, 12);
