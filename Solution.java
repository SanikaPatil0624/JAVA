import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        // Example usage
        String[] words1 = {"mass", "as", "hero", "superhero"};
        String[] words2 = {"leetcode", "et", "code"};
        String[] words3 = {"blue", "green", "bu"};
        
        System.out.println(stringMatching(words1)); // Output: ["as", "hero"]
        System.out.println(stringMatching(words2)); // Output: ["et", "code"]
        System.out.println(stringMatching(words3)); // Output: []
    }
    
    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        
        // Iterate over all words
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                // Check if a word is a substring of another word
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break; // No need to check further, move to the next word
                }
            }
        }
        
        return result;
    }
}
