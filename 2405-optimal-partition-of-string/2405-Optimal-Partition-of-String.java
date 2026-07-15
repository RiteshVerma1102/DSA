class Solution {
    public int partitionString(String s) {
        int[] lastSeen = new int[26];

        for (int i = 0; i < 26; i++) {
            lastSeen[i] = -1;
        }

        int count = 0;
        int substringStart = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (lastSeen[ch - 'a'] >= substringStart) {
                count++;
                substringStart = i;
            }

            lastSeen[ch - 'a'] = i;
        }

        return count + 1;
    }
}