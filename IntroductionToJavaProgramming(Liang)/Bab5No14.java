package folder1;

public class Bab5No14 {

    public static void main(String[] args) {
        int a = 1288;
        int b = 1834;
        System.out.println("a   : " + a);
        System.out.println("b   : " + b);
        
        int min = Math.min(a, b);
        
        /*
        if (a < b) {
            min = a;
        }
        else {
            min = b;
        }
        */
        
        for (int i = min; i >= 1; i--) {
            if (a%i == 0 && b%i == 0) {
                System.out.println("FPB : " + i);
                break;
            }
        }
        
    }
    
}