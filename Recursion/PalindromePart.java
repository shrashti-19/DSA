import java.util.*;

public class PalindromePart{
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        int n = s.length();
        int index = 0;
        findstring(s,n,index,new ArrayList<>(), result);
        return result;
    }
    public static void findstring(String s, int n, int index, List<String>currentlist, List<List<String>>result){
        if(index == n){
            result.add(new ArrayList<>(currentlist));
            return;
        }
        for(int i=index ; i<n ; i++){
            //substring
            String substring = s.substring(index, i+1);
            if(palindrome(substring)){
                currentlist.add(substring);
                findstring(s,n,i+1, currentlist, result);
                currentlist.remove(currentlist.size()-1);
            }
        }
    }

    public static boolean palindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> result = partition(s);
        for(List<String> ans : result){
            System.out.print(ans + ",");
        }
        System.out.println("");
    }
}