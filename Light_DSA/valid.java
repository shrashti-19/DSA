import java.util.*;
public class valid{
    public static boolean validAnagram(String s, String t){
      HashMap<Character, Integer> map = new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            if(!map.containsKey(c)) return false;
            map.put(c,map.get(c)-1);

            if(map.get(c)<0) return false;
        }
        return true;


    }
    public static void main(String args[]){
        String s = "anagram";
        String t = "nagaram";
        System.out.println("Valid Anagram or not : " + validAnagram(s,t));
    }
}