package io;
import java.util.Scanner;

class io_code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myInt = input.nextInt();
        float myFloat = input.nextFloat();
        double myDouble = input.nextDouble();

        System.out.println("Value for Int: " + myInt);
        System.out.println("Value for Float: " + myFloat);
        System.out.println("Value for Double: " + myDouble);

        input.close();

        // Question
        // 1) Check to close the input method by using try-n-catch 
    }
}
