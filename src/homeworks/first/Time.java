package homeworks.first;

public class Time {
    public int seconds;

    public Time(int seconds) {
        this.seconds = seconds;
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
        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }
}
