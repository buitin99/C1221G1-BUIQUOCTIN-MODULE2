package ss4_oop.stop_watch;

import java.time.LocalTime;

public class Bai2StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public void setStartTime() {
        this.startTime = LocalTime.now();
    }

    public void setEndTime() {
        this.endTime = LocalTime.now();
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public double getElapsedTime() {
        int milisecond = ((endTime.getHour() - startTime.getHour()) * 3600 + (endTime.getMinute() - startTime.getMinute()) * 60 + (endTime.getSecond() - startTime.getSecond())*1000);
        return  milisecond;
    }
}
