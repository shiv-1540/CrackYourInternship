public int circularSubarraySum(int arr[]) {
    int n = arr.length;

    // Step 1: Calculate the normal max subarray sum using Kadane's algorithm
    int max_normal = kadane(arr);
    if (max_normal < 0) {
        // If all numbers are negative, return the maximum of the array
        return max_normal;
    }

    // Step 2: Calculate the total sum of the array
    int total_sum = 0;
    for (int num : arr) {
        total_sum += num;
    }

    // Step 3: Calculate the minimum subarray sum
    int min_subarray = kadaneMin(arr);

    // Step 4: Calculate the circular maximum sum
    int max_circular = total_sum - min_subarray;

    // Step 5: Return the maximum of normal and circular
    return Math.max(max_normal, max_circular);
}

// Kadane's Algorithm to find the maximum subarray sum
private int kadane(int[] arr) {
    int max_current = arr[0];
    int max_global = arr[0];

    for (int i = 1; i < arr.length; i++) {
        max_current = Math.max(arr[i], max_current + arr[i]);
        max_global = Math.max(max_global, max_current);
    }
    return max_global;
}

// Modified Kadane's Algorithm to find the minimum subarray sum
private int kadaneMin(int[] arr) {
    int min_current = arr[0];
    int min_global = arr[0];

    for (int i = 1; i < arr.length; i++) {
        min_current = Math.min(arr[i], min_current + arr[i]);
        min_global = Math.min(min_global, min_current);
    }
    return min_global;
}
