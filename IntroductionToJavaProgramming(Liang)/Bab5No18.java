package folder1;

public class Bab5No18 {

    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int baris = 1; baris <= 6; baris++) {
            for (int kolom = 1; kolom <= baris; kolom++) {
                System.out.print(kolom + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Pattern B");
        /*
        for (int baris = 6; baris >= 1; baris--) {
            for (int kolom = 1; kolom <= baris; kolom++) {
                System.out.print(kolom + " ");
            }
            System.out.println();
        }
        */
        for (int baris = 1; baris <= 6; baris++) {
            for (int kolom = 1; kolom <= 7-baris; kolom++) {
                System.out.print(kolom + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= 1; j--) {
                if (j > i) {
                    System.out.print("  ");
                }
                else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    
}