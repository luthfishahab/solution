package folder1;

public class Bab6No25 {

    public static void main(String[] args) {
        long totalMilliseconds = 555550000;
        
        String waktu = convertMillis(totalMilliseconds);
        
        System.out.println(waktu);
    }
    
    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        
        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;
        
        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;
        
        String hasil = totalHours + ":" + currentMinute + ":" + currentSecond;
        
        return hasil;
    }
}
