package folder1;

public class Bab6No1 {

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            int a = getPentagonalNumber(i);
            System.out.print(a + " ");
            
            if (i%10 == 0) {
                System.out.println();
            }
        }
    }
    
    public static int getPentagonalNumber(int n) {
        int hasil = n*(3*n-1)/2;
        return hasil;
    }
}