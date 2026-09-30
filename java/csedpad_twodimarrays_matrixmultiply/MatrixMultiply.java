public class MatrixMultiply {
    public static void main(String[] args) {

        int r1 = 2, c1 = 2;
        int r2 = 2, c2 = 2;
        int[][] x = { {1,2},{3,4} };
        int[][] y = { {4,5}, {6,7} };
        int[][] xy = new int[r1][c2];
        
        
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    xy[i][j] += x[i][k] * y[k][j];
                }
            }
        }
        

        for(int[] row : xy) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

}