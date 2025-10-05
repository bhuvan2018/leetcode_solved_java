import java.util.HashMap;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return 0;
    }
}
public class single_number{
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums={4,1,2,1,2};
        System.out.println("The single number is: "+sol.singleNumber(nums));
    }
}