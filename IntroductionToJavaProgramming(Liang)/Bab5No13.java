package folder1;

public class Bab5No13 {

    public static void main(String[] args) {
        int n = 100;
        while ((int)Math.pow(n,3) > 12000) {
            n--;
        }
        System.out.println("n   : " + n);
        System.out.println("n^3 : " + (int)Math.pow(n,3));
    }
    
}