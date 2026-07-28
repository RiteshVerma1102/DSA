class Solution {
    public int mostWordsFound(String[] sentences) {

        int max = 0; // Maximum words found

        for (String s : sentences) { // Traverse each sentence

            int word = 1; // Every sentence has at least one word

            for (char ch : s.toCharArray()) { // Traverse each character

                if (ch == ' ') { // If space found
                    word++;
                }
            }

            max = Math.max(max, word); // Update maximum
        }

        return max;
    }
}