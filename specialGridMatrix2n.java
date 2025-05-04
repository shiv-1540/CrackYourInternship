class Solution {
    public static int[][] specialGrid(int n) {
        int size = 1 << n; // 2^n
        int[][] grid = new int[size][size];
        fill(grid, 0, 0, size, 0); // fill from top-left (0,0)
        return grid;
    }

    private static void fill(int[][] grid, int row, int col, int size, int start) {
        if (size == 1) {
            grid[row][col] = start;
            return;
        }

        int half = size / 2;
        int blockSize = half * half;

        // Top-Right: smallest block
        fill(grid, row, col + half, half, start); // TR
        // Bottom-Right
        fill(grid, row + half, col + half, half, start + blockSize); // BR
        // Bottom-Left
        fill(grid, row + half, col, half, start + 2 * blockSize); // BL
        // Top-Left: largest block
        fill(grid, row, col, half, start + 3 * blockSize); // TL
    }

}
