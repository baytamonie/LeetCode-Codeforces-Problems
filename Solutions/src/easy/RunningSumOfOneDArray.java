package easy;

public class RunningSumOfOneDArray {


    public static void main(String[] args){
        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        for(int i : runningSum(nums)){
            System.out.print(i+" ");
        }
    }

    public static int[] runningSum(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        ans[0] = nums[0];
        for(int i =1;i<size;i++){
            ans[i] = ans[i-1] + nums[i];
        }
        return ans;
    }

}
