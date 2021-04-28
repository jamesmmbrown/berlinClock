import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Converter {

    private int hours;
    private int minutes;
    private int seconds;
    private String oneMinuteRow;
    private String fiveMinuteRow;

    public void convertTime(String time) {
        convertTimeToHoursSecondsAndMinutes(time);
        oneMinuteRow = convertMinutesToOneMinuteRow(this.minutes);
        fiveMinuteRow = convertMinutesToFiveMinuteRow(this.minutes);
    }

    private void convertTimeToHoursSecondsAndMinutes(String time) {
        List<Integer> parts = Arrays.stream(time.split(":")).map(Integer::parseInt).collect(Collectors.toList());
        this.hours = parts.get(0);
        this.minutes = parts.get(1);
        this.seconds = parts.get(2);
    }

    public String convertMinutesToOneMinuteRow(int minutes) {
        String minuteRow = "OOOO";
        minutes = minutes % 10;
        int m = (minutes < 5) ? minutes % 5 : minutes;
        for (int i = 0; i < m; i++) {
            minuteRow = minuteRow.replaceFirst("O", "Y");
        }
        return minuteRow;
    }

    public String convertMinutesToFiveMinuteRow(int minutes) {
        String minuteRow = "OOOOOOOOOOO";
        int m = minutes / 5;
        for (int i = 1; i <= m; i++) {
            minuteRow = (i % 3 != 0) ? minuteRow.replaceFirst("O", "Y") : minuteRow.replaceFirst("O", "R");
        }
        return minuteRow;
    }

    public String getOneMinuteRow() {
        return this.oneMinuteRow;
    }

    public String getFiveMinutesRow() {
        return this.fiveMinuteRow;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds + "\n" + oneMinuteRow;
    }
}
