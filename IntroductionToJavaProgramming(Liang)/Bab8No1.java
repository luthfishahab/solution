package folder1;

public class Bab8No1 {

    public static void main(String[] args) {
        double[][] a = {{1.5, 2, 3, 4}, 
                        {5.5, 6, 7, 8}, 
                        {9.5, 1, 3, 1}};
        
        double hasil = sumColumn(a, 2);
        
        System.out.println(hasil);
    }
    
    public static double sumColumn(double[][] m, int columnIndex) {
        double hasil = 0;
        for (int i = 0; i < m.length; i++) {
            hasil += m[i][columnIndex];
        }
        
        return hasil;
    }
}