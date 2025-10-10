import java.util.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res=new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                res.append(word1.charAt(i));
            }
            i++;
            if(i<word2.length()){
                res.append(word2.charAt(i));
            }
            i++;
        }
        return res.toString();
    }
}
public class merge_string_alternative {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println("Merged String: " + solution.mergeAlternately(word1, word2));
    }
}