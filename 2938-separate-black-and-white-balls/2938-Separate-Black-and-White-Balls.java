class Solution {
    public long minimumSteps(String s) {
        long ans = 0;
        // int zeroPos = 0;
        int n = s.length();
        int i =0; 
        int j = n - 1;

        // for(int i =0; i < s.length();i++){
        //     if(s.charAt(i) == '0'){
        //         ans += (i - zeroPos);
        //         zeroPos++;
        //     }
        // }
        // return ans;
        while(i < j){
            if(i  < j && s.charAt(i) == '0'){
                i++;
            }
            else if(i < j && s.charAt(j) == '1'){
                j--;
            
            }
            else{
                ans +=(j - i);
                i++;
                j--;
            }
        }
        return ans;
    }
}