import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        boolean dup = false;
    
        
        for (int i = 0; i < nums.length; i++){
            if (hash.containsKey(nums[i])){
                dup = true;
                break;
            }else{
                hash.put(nums[i], i);
            }
                
        }   
        return dup;
    }
}
