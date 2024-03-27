/* Given an array of integers 'nums' and an integer 'target', returns indices of the two numbers such that they add up to 'target'. */
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        // TEST CASE
        int[] nums = new int[] {2, 3, 4, 7, 7, 9};
        int target = 9;

        // Saves result
        int[] result = twoSum(nums, target);
        // Prints result
        System.out.println("["+ result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // If our hashmap contains the compliment of the current element in the array
            if (numToIndex.containsKey(target - nums[i])) {
                // Retun indexes of both elements
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            // Put current element and its index in hashmap
            numToIndex.put(nums[i], i);
        }
        // If no pairs are found returns empty array
        return new int[] {};
    }
}