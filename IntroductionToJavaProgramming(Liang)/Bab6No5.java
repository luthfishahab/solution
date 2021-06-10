package folder1;

public class Bab6No5 {

    public static void main(String[] args) {
        double a = 500;
        double b = 110;
        double c = 120;
        
        displaySortedNumbers(a, b, c);
    }
    
    public static void displaySortedNumbers(double a, double b, double c) {
        if (b < a) {
            double temp = a;
            a = b;
            b = temp;
        }
        
        if (c < b) {
            double temp = b;
            b = c;
            c = temp;
        }
        
        if (b < a) {
            double temp = a;
            a = b;
            b = temp;
        }
        
        System.out.println(a + " " + b + " " + c);
    }
}