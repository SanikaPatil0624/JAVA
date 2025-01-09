class Solution2 {
    public int prefixCount(String[] words, String pref) {
        int count = 0; // Initialize the count of words with the given prefix
        for (String word : words) { // Iterate through the array of words
            if (word.startsWith(pref)) { // Check if the word starts with the prefix
                count++; // Increment the count if it does
            }
        }
        return count; // Return the total count
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String[] words1 = {"pay", "attention", "practice", "attend"};
        String pref1 = "at";
        System.out.println("Output: " + solution.prefixCount(words1, pref1)); // Output: 2

        // Example 2
        String[] words2 = {"leetcode", "win", "loops", "success"};
        String pref2 = "code";
        System.out.println("Output: " + solution.prefixCount(words2, pref2)); // Output: 0
    }
}
