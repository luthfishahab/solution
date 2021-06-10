package folder1;

public class Bab5No24 {

    public static void main(String[] args) {
        double jumlah = 0;
        for (int i = 1; i <= 97; i += 2) {
            double a = i;
            double b = i + 2;
            jumlah += a/b;
        }
        System.out.println(jumlah);
        
    }
    
}