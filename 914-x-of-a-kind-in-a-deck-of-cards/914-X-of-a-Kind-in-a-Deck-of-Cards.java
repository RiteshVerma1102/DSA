class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer , Integer> freq = new HashMap<>();
        int res =0;
        for(int i : deck){
            freq.put(i , freq.getOrDefault(i, 0)+1);
        }
        for(int count : freq.values()){
            res = gcd(count , res);
        }
        return res > 1;
    }

    private int gcd(int a , int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
