import java.util.stream.IntStream;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public void setHour(int hour) {
        if (hour > 23) {
            this.hour = 0;
        }
        else {
            this.hour = hour;
        }

    }

    public void setMinute(int minute) {
        if (minute > 59) {
            this.minute = 0;
        }
        else {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second > 59) {
            this.second = 0;
        }
        else {
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }


    @Override
    public String toString() {
        String timeInString = "";
        if (this.hour >= 10) {
            timeInString += hour;
        }
        else {
            timeInString += "0" + hour;
        }
        timeInString += ":";
        if (this.minute >= 10) {
            timeInString += minute;
        }
        else {
            timeInString += "0" + minute;
        }
        timeInString += ":";
        if (this.second >= 10) {
            timeInString += second;
        }
        else {
            timeInString += "0" + second;
        }

        return timeInString;
    }

    public void nextSecond() {
        second++;
        if (second > 59) {
            this.second = 0;
            minute++;
            if (minute > 59) {
                minute = 0;
                hour++;
                if (hour > 23) {
                    hour = 0;
                }
            }
        }

    }

    public void previousSecond() {
        second--;
        if (second < 0) {
            this.second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }

    }









}
