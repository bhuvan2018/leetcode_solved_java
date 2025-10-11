class Solution {
    public boolean isPalindrome(String s) {
        char chars[]=s.toCharArray();
        StringBuilder cleaned=new StringBuilder();
        for(int i=0;i<chars.length;i++){
            if(Character.isLetterOrDigit(chars[i])){
                cleaned.append(Character.toLowerCase(chars[i]));
            }
        }
        String f=cleaned.toString();
        String r=cleaned.reverse().toString();
        return f.equals(r); 
    }
}
public class valid_palindrome{
    public static void main(String args[]){
        Solution sol=new Solution();
        String s="A man, a plan, a canal: Panama";
        System.out.print(sol.isPalindrome(s));
    }
}