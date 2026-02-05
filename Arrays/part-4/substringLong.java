import java.util.*;


public class substringLong{
    public static int countSubstringLength(String s){
        // int count = 0;
        // HashSet<Character> set = new HashSet<>();
        // for(char c : s.toCharArray()){
        //     set.add(c);
        // }

        // for(char c : set){
        //     count++;
        // }

        // return count;
        // int count = 0;
        // for(int i=0 ; i<s.length() ; i++){
        //     for(int j=i+1 ; j<s.length() ; j++){
        //         if(s.charAt(i)==s.charAt(j)) continue;
        //         else count++;
        //     }
        // }
        // return count;

         int left=0, maxlen = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ;i<s.length() ; i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(i));
            maxlen = Math.max(maxlen,i-left+1);
        }
        return maxlen;
        
    }
    public static void main(String args[]){
        String s = "pwwkew";
        System.out.println(countSubstringLength(s));
    }
}