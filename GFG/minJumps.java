public class Solution {

    static int minJumps(int[] arr) {
        int n = arr.length;

        // If array has only one element, no jumps are needed
        if (n == 1) return 0;

        // If the first element is 0, it's impossible to move further
        if (arr[0] == 0) return -1;

        // Maximum distance reachable from current index
        int maxReach = arr[0];

        // Steps we can still take before we must jump
        int steps = arr[0];

        // Number of jumps made
        int jumps = 1;

        // Traverse the array
        for (int i = 1; i < n; i++) {
            // If we've reached the last index
            if (i == n - 1) return jumps;

            // Update the maximum reach from the current index
            maxReach = Math.max(maxReach, i + arr[i]);

            // Use a step to move to the next index
            steps--;

            // If no more steps are left
            if (steps == 0) {
                // Increment the number of jumps
                jumps++;

                // If current index is beyond or equals the maxReach, it's impossible to move further
                if (i >= maxReach) return -1;

                // Re-initialize steps for the new jump range
                steps = maxReach - i;
            }
        }

        return -1; // If we couldn't reach the last index
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));  // Output: 3
    }
}
