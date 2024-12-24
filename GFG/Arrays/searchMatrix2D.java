public boolean searchMatrix(int[][] mat, int x) {
    int m = mat.length;    
    int n = mat[0].length; 

    int low = 0, high = m * n - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        int midValue = mat[mid / n][mid % n]; 

        if (midValue == x) {
            return true; // Element found
        }
        else if (midValue < x) {
            low = mid + 1; // Search right half
        } 
        else {
            high = mid - 1;
        }
    }

     return false; // Element not found
   }
