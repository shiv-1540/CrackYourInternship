public void setMatrixZeroes(int[][] mat) {
    
        int n = mat.length; // number of rows
        int m = mat[0].length; // number of columns
        boolean isFirstRowZero = false, isFirstColZero = false;

        // Step 1: Check if first row and column have any zeros
        for (int j = 0; j < m; j++) {
            if (mat[0][j] == 0) {
                isFirstRowZero = true;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (mat[i][0] == 0) {
                isFirstColZero = true;
                break;
            }
        }

        // Step 2: Mark rows and columns to be zeroed
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }

        // Step 3: Update the matrix excluding the first row and column
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        // Step 4: Update the first row if needed
        if (isFirstRowZero) {
            for (int j = 0; j < m; j++) {
                mat[0][j] = 0;
            }
        }

        // Step 5: Update the first column if needed
        if (isFirstColZero) {
            for (int i = 0; i < n; i++) {
                mat[i][0] = 0;
            }
        }
    }
