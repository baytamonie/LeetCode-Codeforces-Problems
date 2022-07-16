package easy;

public class PivotIndex {
    public static void main(String[] args){

        int[] nums = new int[] {2,1,-1};
        System.out.println(pivotIndex(nums));
    }

    public  static int pivotIndex(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int sumLeft = 0;
        int sumRight = nums[j];
         j--;
        while(sumLeft!=sumRight){
            if(i==j)
                return -1;


            if(sumLeft<sumRight){
                sumLeft+=nums[i];
                    i++;}
            else{
                sumRight+=nums[j];
                j--;}
        }
        return i;
    }
}
