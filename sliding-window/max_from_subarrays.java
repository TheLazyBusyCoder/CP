class Solution
{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        Deque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> output = new ArrayList<>();
        int i;
        for (i = 0; i < k; ++i) {
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        for (; i < n; ++i) {
            output.add(arr[deque.peek()]);
            while ((!deque.isEmpty()) && deque.peek() <= i - k) {
                deque.removeFirst();
            }
            while ((!deque.isEmpty()) && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        output.add(arr[deque.peek()]);
        return output;
    }
}
