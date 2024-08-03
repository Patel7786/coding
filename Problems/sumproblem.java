package Problems;

import java.util.Arrays;

public class sumproblem {
    public void sum() {
        int arr[] = { 2, 7, 11, 15 };

        int target = 9;
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                break;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }

        }
        System.out.println("i :" + i + " j :" + j);

        // nums = [2,7,11,15], target = 9
        // Output: [0,1]
    }

    public static void main(String[] args) {
        sumproblem s = new sumproblem();
        s.sum();
    }
}
