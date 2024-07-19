//https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

long long findMinDiff(vector<long long> a, long long n, long long m) {
    // Sort the array
    sort(a.begin(),a.end());
    
    // Initialize the minimum difference to a large value
    long long mini = LLONG_MAX;
    
    // Traverse the array and find the minimum difference between the maximum
    // and minimum of every subarray of size m
    for (long long i=0;i+m-1<n;i++) {
        long long diff=a[i+m-1]-a[i];
        if (diff<mini) {
            mini=diff;
        }
    }
    
    return mini;
