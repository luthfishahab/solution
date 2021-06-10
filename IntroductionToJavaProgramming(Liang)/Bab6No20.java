package folder1;

public class Bab6No20 {

    public static void main(String[] args) {
        String teks = "Saya makan 10.";
        // 15
        
        int jumlahHuruf = countLetters(teks);
        System.out.println(jumlahHuruf);
    }
    
    public static int countLetters(String s) {
        int jumlahHuruf = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if ('a' <= x && x <= 'z') {
                jumlahHuruf++;
            }
            else if ('A' <= x && x <= 'Z') {
                jumlahHuruf++;
            }
        }
        
        return jumlahHuruf;
    }
}