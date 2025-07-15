import java.util.HashMap;
public class missingNumber {
    public static int numMiss(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            map.put(nums[i], true);
        }
        for (int i=0;i<=nums.length;i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={0,1,-1,2,3,5};
        int missing=numMiss(nums);
        System.out.println("Missing number is: " + missing);
    }
}