import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter l = DateTimeFormatter.ofPattern("yyyy-dd-MM, HH:mm:ss");
        String formattedTime = currentTime.format(l);

        System.out.println("Сейчас " + currentTime);
        System.out.println(formattedTime);
    }
}