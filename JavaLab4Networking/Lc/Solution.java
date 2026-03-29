package JavaLab4Networking.Lc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);

            arr[i] = nums[i];
        }
        Arrays.sort(arr , (a, b)->{
            int fa = freq.get(a);
            int fb = freq.get(b);
            return (fa!=fb)? fa-fb : a-b;
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }
}