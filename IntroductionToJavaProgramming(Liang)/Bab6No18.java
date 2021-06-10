package folder1;

public class Bab6No18 {

    public static void main(String[] args) {
        String password = "ac$1233";
        
        checkPassword(password);
    }
    
    public static void checkPassword(String p) {
        boolean isValid = true;
        
        if (p.length() < 8) {
            isValid = false;
        }
        
        // rentang ascii 97 - 122, 65 - 90, 48 - 57
        for (int i = 0; i < p.length(); i++) {
            int ascii = p.charAt(i);
            if (97 <= ascii && ascii <= 122) {
                
            }
            else if (65 <= ascii && ascii <= 90) {

            }
            else if (48 <= ascii && ascii <= 57) {

            }
            else {
                isValid = false;
            }
        }
        
        int jumlahDigit = 0;
        for (int i = 0; i < p.length(); i++) {
            int ascii = p.charAt(i);
            if (48 <= ascii && ascii <= 57) {
                jumlahDigit++;
            }
        }
        if (jumlahDigit < 2) {
            isValid = false;
        }
        
        if (isValid) {
            System.out.println("Password valid");
        }
        else {
            System.out.println("Password tidak valid");
        }
    }
    
}