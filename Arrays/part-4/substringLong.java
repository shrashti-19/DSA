import java.util.*;

public class substringLong{
    public static int countSubstringLength(String s){
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            set.add(c);
        }

        for(char c : set){
            count++;
        }

        return count;
        
    }
    public static void main(String args[]){
        String s = "abcddabac";
        System.out.println(countSubstringLength(s));
    }
}