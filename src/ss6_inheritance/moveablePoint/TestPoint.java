package ss6_inheritance.moveablePoint;

public class TestPoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint1 = new MoveablePoint(3, 4);
        moveablePoint1.move();
        moveablePoint1.move();
        System.out.println(moveablePoint1);
    }
}
