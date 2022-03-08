package s15_exception_debug.bai_tap.illegal_triangle_exception;
import java.util.Scanner;
public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}
