package folder1;

public class Bab8No5 {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, 
                     {5, 6, 7, 8}, 
                     {9, 1, 3, 1}};
        
        int[][] b = {{4, 2, 4, 7}, 
                     {2, 0, 5, 6}, 
                     {3, 8, 0, 0}};
        
        int[][] c = addMatrix(a, b);
        
        for (int[] i : c) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static int[][] addMatrix(int[][] a, int[][] b) {
        int baris = a.length;
        int kolom = a[0].length;
        int[][] c = new int[baris][kolom];
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        
        return c;
    }
    
}