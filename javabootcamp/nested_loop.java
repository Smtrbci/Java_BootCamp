package javabootcamp;

import java.util.Scanner;

public class nested_loop {

    public static void main(String args[]) {
        
        // nested loops =  aloop inside of a loop 
        
        Scanner scanner = new Scanner(System.in);
        int rows;
        int colums;
        String symbol = "";
        
        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of colums: ");
        colums = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();
        
        for (int i=1; i<=rows; i++) {
            System.out.println();
            for(int j=1; j<=colums;j++){
                System.out.println(symbol);
            }
        }
    }
}
