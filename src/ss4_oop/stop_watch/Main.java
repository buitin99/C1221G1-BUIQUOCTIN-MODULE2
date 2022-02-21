package ss4_oop.stop_watch;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Bai2StopWatch stopWatch = new Bai2StopWatch();
        stopWatch.setStartTime();
        for (int i = 0 ; i < 1000 ; i++){
            for (int j = 0; j < 1000 ; j++){
                System.out.println(".");
            }
        }
        stopWatch.setEndTime();
        System.out.println(stopWatch.getElapsedTime());
    }
}
