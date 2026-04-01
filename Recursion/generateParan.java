import java.util.*;

public class generateParan{
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        int open=0,close=0;
        paran("", n, result, open, close);
        return result;
    }
    public static void paran(String current, int n, List<String> result, int open, int close){
        int length = current.length();
        if(length==2*n){
            result.add(current);
            return;
        }
        if(open<n){
            paran(current+ "(", n, result, open+1,close);
            //current.remove(current.size()-1);
        }
        if(close<open){
            paran(current + ")",n,result,open,close+1);
            //current.remove(current.size()-1);
        }

        // if want to explicitly try backtracking then we can use Stringbuilder otherwise string will make a new copy everytime.
    }
    public static void main(String args[]){
        int n = 2;
        List<String> result = generateParenthesis(n);
        for(String ans : result){
            System.out.print(ans + ",");
        }
        System.out.println("");
    }
}