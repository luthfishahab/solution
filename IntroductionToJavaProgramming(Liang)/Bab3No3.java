package folder1;

import java.util.Scanner;

public class Bab3No3 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f : ");
        
        double a = bacaInput.nextDouble();
        double b = bacaInput.nextDouble();
        double c = bacaInput.nextDouble();
        double d = bacaInput.nextDouble();
        double e = bacaInput.nextDouble();
        double f = bacaInput.nextDouble();
        
        if (a*d-b*c == 0) {
            System.out.println("The equation has no solution");
        }
        else {
            double x = (e*d-b*f) / (a*d-b*c);
            double y = (a*f-e*c) / (a*d-b*c);

            System.out.println("x is " + x + " and y is " + y);
        }
        
    }
    
}