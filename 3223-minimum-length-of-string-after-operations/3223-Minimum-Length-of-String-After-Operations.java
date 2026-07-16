class Solution {
    public int minimumLength(String s) {
        int[]  freq= new int[26];
        int i = 0;

        while(i < s.length()){  
            freq[s.charAt(i) - 'a']++;
            i++;
        }
        int ans =0;
        i = 0;
        while(i < 26){
            if(freq[i] != 0){
                if(freq[i] % 2 == 0)
                    ans += 2;
                else
                    ans += 1;

                }
                i++;

            }
            return ans;
    }
}