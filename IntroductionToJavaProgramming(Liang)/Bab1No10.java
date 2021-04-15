package folder1;

public class Bab1No10 {

    public static void main(String[] args) {
        double a = 14; // kilometer
        double b = 45; // menit
        double c = 30; // detik
        
        double d = a / 1.6; // kilometer -> mil
        double e = b * 60 + 30; // menit + detik -> detik
        double f = e / 3600; // detik -> jam
        
        double g = d / f; // mil/jam
        
        System.out.println(g);
        
        
        
    }
    
}