import java.util.*;

public class four{
    public static  List<Integer> partitionLabels(String s) {
        //finding the last occurences of characters
        int[] lastOccurrence = new int[26];
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            lastOccurrence[c-'a'] = i;
        }
        // so for example it will be a->2, b->3, c->5
        List<Integer> result = new ArrayList<>();
        int start = 0, end=0;
        for(int i=0  ;i<s.length()  ; i++){
            char c = s.charAt(i);
            end = Math.max(end,lastOccurrence[c-'a']);
            if(i==end){
                int size = end-start+1;
                result.add(size);
                start = i+1;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        String s = "ababcc";
        List<Integer> ans = partitionLabels(s);
        for(int i : ans){
            System.out.println(i + " ");
        }
    }
}