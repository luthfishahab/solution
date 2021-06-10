package folder1;

import java.util.Scanner;

public class Bab5No1 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0 : ");
        
        int positif = 0;
        int negatif = 0;
        int total = 0;
        int n = 0;
        
        int a;
        do {
            a = bacaInput.nextInt();
            
            if (a > 0) {
                positif++;
            }
            
            if (a < 0) {
                negatif++;
            }
            
            total = total + a;
            n++;
            
        }
        while (a != 0);
        
        if (n > 1) {
            n--;

            System.out.println("Banyaknya yang positif : " + positif);
            System.out.println("Banyaknya yang negatif : " + negatif);
            System.out.println("Total : " + total);

            double ratarata = ((double)total)/n;

            System.out.println("Rata-rata : " + ratarata);
        }
        else {
            System.out.println("No numbers are entered except 0");
        }
        
        
        
        
    }
    
}
