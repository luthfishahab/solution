package folder1;

public class Bab6No17 {

    public static void main(String[] args) {
        int n = 10;
        
        printMatrix(n);
    }
    
    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double r = Math.random();
                int a = 0;
                if (r > 0.5) {
                    a = 1;
                }
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
    
}