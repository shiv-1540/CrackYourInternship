 myAtoipublic int myAtoi(String s) {
    if (s == null || s.isEmpty()) {
        return 0; // Edge case: empty or null string
    }

    // Trim leading and trailing spaces
    s = s.trim();

    // Check if the string is empty after trimming
    if (s.isEmpty()) {
        return 0;
    }

    int sign = 1;
    int index = 0;
    long num = 0;

    // Check the sign
    if (s.charAt(index) == '-') {
        sign = -1;
        index++;
    } else if (s.charAt(index) == '+') {
        index++;
    }

    // Parse the numeric part
    while (index < s.length() && Character.isDigit(s.charAt(index))) {
        num = num * 10 + (s.charAt(index) - '0');

        // Clamp the value to avoid overflow
        if (sign == 1 && num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (sign == -1 && -num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        index++;
    }

    // Return the result with the correct sign
    return (int) (sign * num);
}
