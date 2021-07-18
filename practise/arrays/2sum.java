import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 1;
        HashMap<Integer, Integer> di = new HashMap<Integer, Integer>();
        di.put(nums[0],0);
        int[] vr = {0};
        while (i < nums.length){
            int comp = target - nums[i];
            if (di.containsKey(comp)){
                int j = di.get(comp);
                int[] k = {i, j};
                return k;
            }
            di.put(nums[i],i);
            ++i;
        }
        return vr;
    }
}
