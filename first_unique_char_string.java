import java.util.HashMap;
class Solution{
    public int firstUniqChar(String s){
        char[] chars=s.toCharArray();
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<chars.length;i++){
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }
        for(int i=0;i<chars.length;i++){
            if(map.get(chars[i])==1){
                return i;
            }
        }
        return -1;
    }
}
public class first_unique_char_string{
    public static void main(String[] args) {
        Solution sol = new Solution();

        String input = "loveleetcode";
        int result = sol.firstUniqChar(input);

        System.out.println("First unique character index: " + result);
    }
}