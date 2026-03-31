import java.util.*;

public class restoreIP{
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        int index = 0;
        int n = s.length();
        findIP(index, s,n,  new ArrayList<>(), result);
        return result;
    }
    public static void findIP(int index, String s,int n, List<String>parts, List<String>result){
        //base conditions
        if(parts.size() == 4 && index==n){
            String ip = String.join(".", parts);
            result.add(ip);
            return;
        }
        if(parts.size()==4 || index==n) return;

        for(int len=1 ; len<=3 ; len++){
            if(index+len>s.length()) continue;
            String subString = s.substring(index, index+len);

            //leading zeroes check
            if(subString.length()>1 && subString.charAt(0)=='0') break;

            //value check 
            if(Integer.parseInt(subString)>255) break;

            //add substring into parts
            parts.add(subString);

            // recurse
            findIP(index+len, s, n, parts, result);

            //backtrack
            parts.remove(parts.size()-1);
        }
    }
    public static void main(String[] args) {
        String s = "2552";
        List<String> result = restoreIpAddresses(s);
        for(String ans : result){
            System.out.print(ans + ",");
        }
        System.out.println("");
    }
}