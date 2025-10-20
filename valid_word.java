class Solution{
    public boolean isValid(String word){
        boolean hasVowel=false;
        boolean hasConsonant=false;
        if(word.length()<3) return false;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(!Character.isLetterOrDigit(c)) return false;
            char lower=Character.toLowerCase(c);
            if(lower=='a' || lower=='e' || lower=='i' || lower=='o' || lower=='u'){
                hasVowel=true;
            }else if(Character.isLetter(lower)){
                hasConsonant=true;
            }
        }
        return hasVowel && hasConsonant;
    }
}
public class valid_word {
    public static void main(String[] args) {
        Solution sol=new Solution();
        String word="Hello1";
        boolean result=sol.isValid(word);
        System.out.println("Is the word valid? " + result);
    }
}