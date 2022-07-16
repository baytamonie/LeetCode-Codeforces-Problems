package easy;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = new int[]{1,7,3,6,5,6};
        Solution solution = new Solution();
        System.out.println(solution.pivotIndex(nums));
    }

    static class Solution {
        public int pivotIndex(int[] nums) {

            int sumLeft = 0, sumRight = 0;
            for(int num : nums) sumRight+=num;
            for(int i =0;i<nums.length;i++){
                sumRight-=nums[i];
                if(sumLeft == sumRight) return i;
                sumLeft+=nums[i];
            }
            return -1;
        }
    }

}
