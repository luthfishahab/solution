package folder1;

import java.util.Scanner;

public class Bab7No11 {

    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        
        double[] a = new double[10];
        
        System.out.print("Masukkan 10 bilangan : ");
        
        for (int i = 0; i < 10; i++) {
            a[i] = bacaInput.nextDouble();
        }
        
        double ratarata = mean(a);
        System.out.println("Rata-rata : " + ratarata);
        
        double std = deviation(a);
        System.out.println("Standard Deviasi: " + std);
    }
    
    /** Compute the mean of an array of double values */
    public static double mean(double[] x) {
        double jumlah = 0;
        /*
        for (double i : x) {
            jumlah += i;
        }
        */
        for (int i = 0; i < x.length; i++) {
            jumlah += x[i];
        }
        
        double ratarata = jumlah / x.length;
        
        return ratarata;
    }
    
    /** Compute the deviation of double values */
    public static double deviation(double[] x) {
        double ratarata = mean(x);
        
        double jumlah = 0;
        /*
        for (double i : x) {
            jumlah += Math.pow(i - ratarata, 2);
        }
        */
        for (int i = 0; i < x.length; i++) {
            jumlah += Math.pow(x[i] - ratarata, 2);
        }
        
        double a = jumlah / (x.length - 1);
        
        double b = Math.sqrt(a);
        
        return b;
    }
    
}