import java.util.*;

public class Combination{
    public static  List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int size = 0;
        List<Integer> currentlist = new ArrayList<>();
        findcombine(n,k,1,size,currentlist,result);
        return result;
    }
    public static void findcombine(int n, int k, int index, int size, List<Integer>currentlist, List<List<Integer>>result){
        if(size==k){
            result.add(new ArrayList<>(currentlist));
            return;
        }

        for(int i=index; i<=n ; i++){
            currentlist.add(i);
            findcombine(n, k, i+1, size+1, currentlist, result);
            currentlist.remove(currentlist.size()-1);
        }
    }
    public static void main(String[] args) {
        int n = 4, k=2;
        List<List<Integer>> result = combine(n, k);
        for(List<Integer> ans : result){
            System.out.print(ans + ",");
        }
        System.out.println("");
    }
}