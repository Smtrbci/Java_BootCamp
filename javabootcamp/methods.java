
package javabootcamp;

public class methods {

    public static void main(String args[]) {
        
        // methods = a block of code that is executed whenever it is called upon
        
        String name = "Github";
        int age = 21;
        
        hello(name,age);
        
    }
    
    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }
}
