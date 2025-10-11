class Solution{
    public boolean isMonotonic(int[] nums){
        boolean decreasing=true;
        boolean increasing=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                decreasing=false;
            }
            if(nums[i]<nums[i-1]){
                increasing=false;
            }
        }
        return increasing||decreasing;
    }
}
public class monotonic_array{
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={1,2,2,3};
        System.out.println(sol.isMonotonic(nums));
    }
}