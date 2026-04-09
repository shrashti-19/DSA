public class substring{
    public static  String longestPalindrome(String s) {
        int length = 0;
        int maxlength = 0;
        int startindex =0;
        for(int start=0 ; start<s.length() ; start++){
            for(int end=start ; end<s.length() ; end++){
                if(isPalindrome(s,start,end)){
                    length = end-start+1;
                    if(length>maxlength){
                        maxlength = Math.max(length, maxlength);
                        startindex = start;
                    }
                }
            }
        }
        return s.substring(startindex, startindex + maxlength);
    }
    public static boolean isPalindrome(String s, int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "babad";
        String result = longestPalindrome(s);
        for(int i=0 ; i<result.length() ; i++){
            System.out.print(result.charAt(i));
        }
        System.out.println("");
    }
}