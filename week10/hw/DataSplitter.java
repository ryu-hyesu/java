import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.StringTokenizer;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
public class DataSplitter {
    public static void main(String[] args) {
        String input = "B02512,1/1/2015,190,1132";

        StringTokenizer tokenizer = new StringTokenizer(input, ",");

        String id = tokenizer.nextToken();
        String dateString = tokenizer.nextToken();
        int value1 = Integer.parseInt(tokenizer.nextToken());
        int value2 = Integer.parseInt(tokenizer.nextToken());

        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("M/d/yyyy"));
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String dayOfWeekString = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US);

        System.out.println("ID: " + id);
        System.out.println("Date: " + date);
        System.out.println("Day of Week: " + dayOfWeekString);
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
    }
}
