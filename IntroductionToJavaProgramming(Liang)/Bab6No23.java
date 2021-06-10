package folder1;

public class Bab6No23 {

    public static void main(String[] args) {
        String teks = "Welcome my brother";
        char a = 'o';
        
        int jumlah = count(teks, a);
        
        System.out.println(jumlah);
    }
    
    public static int count(String str, char a) {
        int jumlah = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                jumlah++;
            }
        }
        
        return jumlah;
    }
}