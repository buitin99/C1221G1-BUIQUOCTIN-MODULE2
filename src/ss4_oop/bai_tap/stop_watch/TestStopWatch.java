package ss4_oop.bai_tap.stop_watch;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
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
