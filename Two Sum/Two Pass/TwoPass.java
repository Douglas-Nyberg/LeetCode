import java.util.HashMap;

class TwoPass {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] soln = new int[2];
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(target - nums[i]) && i != hash.get(target - nums[i])) {
                soln[0] = i;
                soln[1] = hash.get(target - nums[i]);
                return soln;
            }

        }

        return null;
    }
}
