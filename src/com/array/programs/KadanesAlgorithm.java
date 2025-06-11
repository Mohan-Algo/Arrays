package com.array.programs;
public class KadanesAlgorithm {

    // Function to find the maximum subarray sum
    public static int maxSubArraySum(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Update maxEndingHere to include current element or start fresh from current element
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);

            // Update maxSoFar if needed
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = maxSubArraySum(arr);
        System.out.println("Maximum contiguous subarray sum is: " + maxSum);
    }
}
