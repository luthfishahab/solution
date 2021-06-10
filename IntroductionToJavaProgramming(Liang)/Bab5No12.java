package folder1;

public class Bab5No12 {

    public static void main(String[] args) {
        int n = 1;
        while (Math.pow(n,2) < 12000) {
            n++;
        }
        System.out.println("n   : " + n);
        System.out.println("n^2 : " + Math.pow(n,2));
    }
    
}