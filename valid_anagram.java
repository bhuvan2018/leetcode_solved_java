import java.util.Arrays;
class Solution{
    public boolean isAnagram(String s, String t){
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}
public class valid_anagram{
    public static void main(String[] args){
        Solution sol = new Solution();
        String s="anagram";
        String t="nagaram";
        boolean result=sol.isAnagram(s, t);
        System.out.println("Are the two strings anagrams? " + result);
    }
}