class Solution11 {
    public int strStr(String haystack, String needle) {
        // If the needle is empty, return 0
        if (needle.length() == 0) {
            return 0;
        }

        // Iterate through the haystack
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean match = true;
            // Check if the substring starting from index i matches needle
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    match = false;
                    break;
                }
            }
            // If a match is found, return the starting index
            if (match) {
                return i;
            }
        }

        // If no match is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack = "sadbutsad";
        String needle = "sad";
        int s = solution.strStr(haystack, needle);
        System.out.println(s);  // Output: 0
    }
}
