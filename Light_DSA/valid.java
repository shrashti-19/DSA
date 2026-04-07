
public class valid{
    public static boolean validAnagram(String s, String t){
       int[]cnt = new int[26];
       if(s.length()!=t.length()) return false;
       for(int i=0 ; i<s.length() ; i++){
          cnt[s.charAt(i)-'a']++;
          cnt[t.charAt(i)-'a']--;
       }
       for(int num : cnt){
        if(num!=0) return false;
       }
       return true;


    }
    public static void main(String args[]){
        String s = "anagram";
        String t = "nagaram";
        System.out.println("Valid Anagram or not : " + validAnagram(s,t));
    }
}