package _15_exception_debug.exercise.triangle_exception;

public class IllegalTriangleException  extends Exception {
    IllegalTriangleException(String message){
        super(message);
    }
}