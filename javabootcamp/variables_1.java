package javabootcamp;

public class variables_1 {
    public static void main(String[] args) {
        String x = "water";
        String y = "Kool - Aid";
        String temp;
        
        //x=y;
        
        temp = x;
        x=y;
        y=temp;
        
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
