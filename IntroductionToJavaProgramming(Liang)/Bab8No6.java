package folder1;

public class Bab8No6 {

    public static void main(String[] args) {
        double[][] a = {{1, 2, 3, 4}, 
                        {4, 5, 6, 1}, 
                        {7, 8, 9, 0}};
        
        double[][] b = {{0,   2,   4,   1, 1}, 
                        {1,   4.5, 2.2, 1, 1}, 
                        {1.1, 4.3, 5.2, 1, 1},
                        {1,   2,   3,   1, 1}};
        
        double[][] c = multiplyMatrix(a, b);
        
        for (double[] i : c) {
            for (double j : i) {
                double k = j*10;
                k = Math.round(k);
                k = k/10;
                System.out.print(k + "\t");
            }
            System.out.println();
        }
    }
    
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        int baris_a = a.length;
        int kolom_a = a[0].length;
        int baris_b = b.length;
        int kolom_b = b[0].length;
        
        double[][] c = new double[baris_a][kolom_b];
        
        if (kolom_a == baris_b) {
            for (int i = 0; i < baris_a; i++) {
                for (int j = 0; j < kolom_b; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < kolom_a; k++) {
                        c[i][j] += a[i][k]*b[k][j];
                    }
                    //c[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j];
                }
            }
        }
        
        return c;
    }
}