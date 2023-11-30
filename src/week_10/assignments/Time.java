package week_10.assignments;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        long totalSecond = System.currentTimeMillis() / 1000;
        second = (int) (totalSecond % 60);
        minute = (int) ((totalSecond / 60) % 60);
        hour = (int) ((totalSecond / 3600) % 24);
    }

    public Time(int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public Time(long elapsedTime) {
       long totalSecond = elapsedTime/1000;
        this.second = (int) (elapsedTime % 60);
        this.minute = (int) ((elapsedTime / 60) % 60);
        this.hour = (int) ((elapsedTime / 3600) % 24);
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setTime(long elapsedTime) {
        this.second = (int) (elapsedTime % 60);
        this.minute = (int) ((elapsedTime / 60) % 60);
        this.hour = (int) ((elapsedTime / 3600) % 24);
    }

    public String toString(){
        return this.hour +":" +this.minute + ":" +this.second;

    }
}

