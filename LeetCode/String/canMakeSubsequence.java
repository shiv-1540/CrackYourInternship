public boolean canMakeSubsequence(String str1, String str2) {
    int j = 0; // Pointer for str2
    for (int i = 0; i < str1.length() && j < str2.length(); i++) {
        // Current character from str1
        char current = str1.charAt(i);
        
        // Character from str2 to match
        char target = str2.charAt(j);

        // Check if current matches target or can be incremented to match target
        if (current == target || (current - 'a' + 1) % 26 + 'a' == target) {
            j++; // Move to the next character in str2
        }
    }
    // If we matched all characters of str2, return true
    return j == str2.length();
}
