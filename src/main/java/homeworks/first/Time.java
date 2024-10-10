package homeworks.first;

import lombok.Getter;

public class Time {
    @Getter
    private int seconds;

    static {
        SECONDS_IN_DAY = 60 * 60 * 24;
        SECONDS_IN_HOUR = 60 * 60;
        SECONDS_IN_MINUTES = 60;
    }

    private static final int SECONDS_IN_DAY, SECONDS_IN_HOUR, SECONDS_IN_MINUTES;

    public Time(int seconds, int minutes, int hour) {
        this(seconds + SECONDS_IN_MINUTES * minutes + SECONDS_IN_HOUR * hour);
    }

    public Time(int seconds) {
        if (seconds <= 0) throw new IllegalArgumentException("seconds must be not negative");
        this.seconds = seconds % SECONDS_IN_DAY;
    }

    public int hours() {
        return seconds / SECONDS_IN_HOUR;
    }

    public int minutes() {
        return (seconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTES;
    }

    public int seconds() {
        return seconds % SECONDS_IN_MINUTES;
    }

    public int howManyMinutesLeftAfterHour() {
        return (seconds - SECONDS_IN_HOUR * hours()) / SECONDS_IN_MINUTES;
    }

    public int howManySecondsLeftAfterMinutes() {
        return seconds();
    }

    @Override
    public String toString() {
        return hours() + ":" + minutes() + ":" + seconds();
    }
}

class TestTime {
    public static void main(String[] args) {
        Time time1 = new Time(10000);
        Time time2 = new Time(5, 3, 2);

        System.out.println(time1);
        System.out.println(time2);
    }
}
