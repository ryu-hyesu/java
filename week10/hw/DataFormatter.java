import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.StringTokenizer;

public class DataFormatter {
    public static void main(String[] args) {
        String input = "B02512,1/8/2015,238,1772";

        StringTokenizer tokenizer = new StringTokenizer(input, ",");
        String baseNumber = tokenizer.nextToken();
        String dateString = tokenizer.nextToken();
        int activeVehicles = Integer.parseInt(tokenizer.nextToken());
        int trips = Integer.parseInt(tokenizer.nextToken());

        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("M/d/yyyy"));
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String dayOfWeekString = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();

        String output = baseNumber + "," + dayOfWeekString + " " + activeVehicles + "," + trips;
        System.out.println(output);
    }
}
