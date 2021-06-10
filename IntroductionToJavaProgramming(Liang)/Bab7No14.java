package folder1;

public class Bab7No14 {

    public static void main(String[] args) {
        int[] a = {120, 80, 100, 110};
        
        int hasil = gcd(a);
        
        System.out.println("FPB nya adalah : " + hasil);
    }
    
    public static int min(int[] a) {
        int hasil = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < hasil) {
                hasil = a[i];
            }
        }
        return hasil;
    }
    
    public static int gcd(int[] numbers) {
        int hasil = 1;
        for (int i = 2; i <= min(numbers); i++) {
            int n = 0;
            for (int j : numbers) {
                if (j % i == 0) {
                    n++;
                }
            }
            if (n == numbers.length) {
                hasil = i;
            }
        }
        return hasil;
    }
    
}