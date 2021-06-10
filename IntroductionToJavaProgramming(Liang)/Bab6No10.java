package folder1;

public class Bab6No10 {

    public static void main(String[] args) {
        int jumlah_bilangan_prima = 0;
        
        for (int n = 2; n < 10000; n++) {
            if (isPrime(n)) {
                jumlah_bilangan_prima++;
            }
        }
        
        System.out.println(jumlah_bilangan_prima);
    }
    
    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }
        return true; // Number is prime
    }
    
}
