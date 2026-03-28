import java.util.*;

public class CombinationSumIII{
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        findcomb(k,n,1,result,new ArrayList<>(),0,0);
        return result;
    }
    public static void findcomb(int k, int n, int start,List<List<Integer>>result, List<Integer>currentlist,int size,int sum ){
        if(size==k && sum==n){
            result.add(new ArrayList<>(currentlist));
            return;
        }
        if(size==k && sum!=n)return;
        if(sum>n) return;

        for(int i=start ; i<=9 ; i++){
            currentlist.add(i);

            findcomb(k, n, i+1, result, currentlist, size+1, sum+i);
            currentlist.remove(currentlist.size()-1);
        } 
    }
    public static void main(String[] args) {
        int n =9 , k=3;
        List<List<Integer>>result = combinationSum3(k,n);
        for(List<Integer> ans : result){
            System.out.print(ans + "");
        }
        System.out.println("");

    }
}