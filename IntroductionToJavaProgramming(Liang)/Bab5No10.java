package folder1;

public class Bab5No10 {

    public static void main(String[] args) {
        int n = 0;
        int i;
        
        for (i = 100; i <= 1000; i++) {
            if (i%5 == 0 && i%6 == 0) {
                System.out.print(i + " ");
                n++;
                
                if (n == 10) {
                    System.out.println();
                    n = 0;
                }
            }
        }
        
        for (i = 120; i <= 1000; i+=30) {
            System.out.print(i + " ");
            n++;

            if (n == 10) {
                System.out.println();
                n = 0;
            }
        }
        
    }
    
}