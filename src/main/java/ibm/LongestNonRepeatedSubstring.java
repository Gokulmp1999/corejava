package ibm;

import java.util.HashMap;

public class LongestNonRepeatedSubstring {
    public static void main(String[] args) {
        String s = "abcbbcc";
        String longestSubstring = findLongestNonRepeatedSubstring(s);
        System.out.println("Longest non-repeated substring: " + longestSubstring);
    }

    public static String findLongestNonRepeatedSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        int n = s.length();
        int start = 0;
        int maxLen = 0;
        int maxLengthStart = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }

            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                maxLengthStart = start;
            }

            charIndexMap.put(currentChar, end);
        }

        return s.substring(maxLengthStart, maxLengthStart + maxLen);
    }
}
