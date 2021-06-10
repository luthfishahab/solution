package folder1;

public class Bab8No13 {

    public static void main(String[] args) {
        double[][] a = {{0,   2,   4,   1,  1}, 
                        {1,   4.5, 2.2, 1,  1}, 
                        {1.1, 4.3, 5.2, 10, 1},
                        {1,   20,  3,   1,  1}}; // 3 dan 1
        
        int[] posisi = locateLargest(a);
        
        System.out.println(posisi[0]);
        System.out.println(posisi[1]);
    }
    
    public static int[] locateLargest(double[][] a) {
        int baris = a.length;
        int kolom = a[0].length;
        
        double max = a[0][0];
        int[] posisi = {0, 0};
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    posisi[0] = i;
                    posisi[1] = j;
                }
            }
        }
        
        return posisi;
    }
}