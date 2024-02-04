public class LUDecomposition {
    public static void main(String[] args) {
        double[][] A = { { 3, 2}, { 1,4 } };
        double[][] LU = decompose(A);

        System.out.println("L:");
        printMatrix(getLower(LU));
        System.out.println("U:");
        printMatrix(getUpper(LU));
    }

    public static double[][] decompose(double[][] A) {
        int n = A.length;
        double[][] LU = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                double sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += LU[i][k] * LU[k][j];
                }
                LU[i][j] = A[i][j] - sum;
            }

            for (int j = i + 1; j < n; j++) {
                double sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += LU[j][k] * LU[k][i];
                }
                LU[j][i] = (A[j][i] - sum) / LU[i][i];
            }
        }

        return LU;
    }

    public static double[][] getLower(double[][] LU) {
        int n = LU.length;
        double[][] L = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    L[i][j] = 1;
                } else if (i > j) {
                    L[i][j] = LU[i][j];
                }
            }
        }

        return L;
    }

    public static double[][] getUpper(double[][] LU) {
        int n = LU.length;
        double[][] U = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    U[i][j] = LU[i][j];
                }
            }
        }

        return U;
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}