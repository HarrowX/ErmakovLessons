package homeworks.first;

public class Time {
    public int seconds;

    public Time(int seconds, int minuts, int hour) {
        this.seconds = seconds + 60 * minuts + 3600 * hour;
    }

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public int getHour() {
        return (seconds % (24 * 60 * 60)) / (60 * 60);
    }

    public int howManyMinutesLeftAfterHour() {
        return seconds % (24 * 60 * 60) - getHour();
    }
    public int howManySecondsLeftAfterMinutes() {
        return (seconds % (60 * 60))  - (seconds % (60 * 60)) / (60) ;
    }

    @Override
    public String toString() {
        String out = "";

        out += (seconds % (24 * 60 * 60)) / (60 * 60);
        out += ":";
        out += (seconds % (60 * 60)) / (60);
        out += ":";
        out += seconds % 60;

        return out;
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
