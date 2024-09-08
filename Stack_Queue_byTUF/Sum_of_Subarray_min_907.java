package Stack_Queue_byTUF;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Sum_of_Subarray_min_907 {
    public static int sumSubarrayMins(int[] arr) {
        int length = arr.length;
        // array that stores the previous smaller element index
        int[] left = new int[length];
        // array that stores the next smaller element index
        int[] right = new int[length];

        /*
        * initially fill the previous smaller element with -1 and next smaller element with the size
        * of array, this initially filled value changes when we encounter any other smaller value
        */
        Arrays.fill(left, -1);
        Arrays.fill(right, length);

        // we use Deque and use as a Stack
        //  stores the indices of the smaller element
        Deque<Integer> stack = new ArrayDeque<>();

        // traversing from left to right to store the previous smaller element
        for (int i = 0; i < length; ++i) {
            /*
            * we check if stack is not empty and has stack stored index array element
            * is greater than the pointing array element then pop all the elements
            * that are greater than the pointing element e.g. stack stored index element is
            * 6,7,8,1 and pointing element is 2 then we pop 6,7,8 and store 2 on top of 1
            * this way stack help left array[] store the previous smaller element for each
            * element in the array
             */
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            }
            stack.push(i);
        }
        // we clear the stack for operating on right array to store next smaller element
        stack.clear();

        /*
         * we traverse from right to left to get next smaller element of each element
         * we check if stack is not empty and has stack stored index array element
         * is greater than the pointing array element then pop all the elements
         * that are greater than the pointing element e.g. stack stored index element is
         * 6,7,8,1 and pointing element is 2 then we pop 6,7,8 and store 2 on top of 1
         * this way stack help right array[] store the next smaller element for each
         * element in the array
         */
        for (int i = length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                right[i] = stack.peek();
            }
            stack.push(i);
        }

        //store the
        int mod = (int) 1e9 + 7;
        long answer = 0;

        for (int i = 0; i < length; ++i) {
            answer += (long) (i - left[i]) * (right[i] - i) % mod * arr[i] % mod;
            answer %= mod;
        }

        return (int) answer;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
}
