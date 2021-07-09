package com.tyler.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tyler
 * @date 2021/7/9 23:11
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println(result[0] == 0);
        System.out.println(result[1] == 1);
        int[] res = twoSumBetter(arr, target);
        System.out.println(res[0] == 0);
        System.out.println(res[1] == 1);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] twoSumBetter(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
