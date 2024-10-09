package homeworks.first;

public class Time {
    public int seconds;

    static {
        SECONDS_IN_DAY = 60 * 60 * 24;
        SECONDS_IN_HOUR = 60 * 60;
        SECONDS_IN_MINUTES = 60;
    }
    private static final int SECONDS_IN_DAY, SECONDS_IN_HOUR, SECONDS_IN_MINUTES;

    public Time(int seconds, int minuts, int hour) {
        this.seconds = seconds + 60 * minuts + 3600 * hour;
    }

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public int getHour() {
        return (seconds % SECONDS_IN_DAY) / SECONDS_IN_HOUR;
    }
    public int getMinutes() {
        return (seconds  % SECONDS_IN_HOUR) / SECONDS_IN_MINUTES;
    }

    public int getSeconds() {
        return seconds % SECONDS_IN_MINUTES;
    }

    public int howManyMinutesLeftAfterHour() {
        return seconds % SECONDS_IN_DAY - getHour();
    }
    public int howManySecondsLeftAfterMinutes() {
        return (seconds % (60 * 60))  - (seconds % (60 * 60)) / (60) ;
    }

    @Override
    public String toString() {
        return getHour()+":" + getMinutes()+ ":" +getSeconds();
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
