import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Converter {

    private int hours;
    private int minutes;
    private int seconds;
    private String oneSecondRow;

    public void convertTime(String time) {
        convertTimeToHoursSecondsAndMinutes(time);
        convertSecondsToOneMinuteRow(this.seconds);
    }

    private void convertTimeToHoursSecondsAndMinutes(String time) {
        List<Integer> parts = Arrays.stream(time.split(":")).map(part -> Integer.parseInt(part)).collect(Collectors.toList());
        this.hours = parts.get(0);
        this.minutes = parts.get(1);
        this.seconds = parts.get(2);
    }

    public String convertSecondsToOneMinuteRow(Integer seconds) {
        if (seconds == 0) {
            oneSecondRow = "OOOO";
        }
        return oneSecondRow;
    }

    public String getOneSecondRow() {
        return this.oneSecondRow;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
