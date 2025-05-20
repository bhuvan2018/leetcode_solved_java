public class squares_of_sorted_array {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int i=n-1;
        int result[] = new int[n];
        while(left<=right){
            int leftsq=nums[left]*nums[left];
            int rightsq=nums[right]*nums[right];
            if (leftsq>rightsq) {
                result[i] = leftsq;
                left++;
            } else {
                result[i] = rightsq;
                right--;
            }
            i--;
        }
        return result;
    }
}