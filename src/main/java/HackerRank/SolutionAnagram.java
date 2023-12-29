package HackerRank;

import java.util.Scanner;

public class SolutionAnagram {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.next();
//        String b = scanner.next();
//        scanner.close();

        boolean result = isAnagram("anagram","margana");
        if (result) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
    static boolean isAnagram(String a, String b) {
        // Check if the lengths of both strings are equal; if not, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Convert both strings to lowercase to make the comparison case-insensitive
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Create an array to store character frequencies for English alphabet
        int[] charCount = new int[26];

        // Count the frequency of characters in string 'a'
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                charCount[ch - 'a']++;
            }
        }

        // Check if the character frequencies in string 'b' match with string 'a'
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                charCount[ch - 'a']--;
                // If at any point, the frequency becomes negative, 'a' and 'b' are not anagrams
                if (charCount[ch - 'a'] < 0) {
                    return false;
                }
            }
        }

        // If all character frequencies are zero, 'a' and 'b' are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
