/*
Input:
IIDDD
Output:
126543
Explanation:
Above example is self- explanatory,
1 < 2 < 6 > 5 > 4 > 3
  I - I - D - D - D
*/

class Stack {
    int arr[] = new int[100];
    int top;
    Stack() {
        this.top = -1;
    }
    void push(int data) {
        this.arr[++this.top] = data;
    }
    int pop() {
        if(top == -1) return -1;
        int temp = this.arr[this.top];
        this.top--;
        return temp;
    }
    int[] reverse() {
        int temp[] = new int[this.top+1];
        int k = 0;
        for(int i = this.top; i >= 0; i--) {
            temp[k] = this.arr[i];
            k++;
        }
        return temp;
    }
    void delete() {
        this.top = -1;
    }
}

class Solution{
    static String printMinNumberForPattern(String S){
        ArrayList<Integer> result = new ArrayList<>();
        Stack stack = new Stack();
        int n = 1;
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            stack.push(n);
            n += 1;
            if(c == 'I') {
                int temp[] = stack.reverse();
                for(int e: temp) {
                    result.add(e);
                }
                stack.delete();
            }
        }
        stack.push(n);
        int temp[] = stack.reverse();
        for(int e: temp) {
            result.add(e);
        }
        
        StringBuilder output = new StringBuilder();
        for(int e: result) {
            output.append(e);
        }
        return output.toString();
    }
}
