import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        byte num;
        Scanner input = new Scanner(System.in);
        int myInt = input.nextInt();
        float myFloat = input.nextFloat();
        double myDouble = input.nextDouble();
        
        
        System.out.println("Hello World");
        System.out.println("-----------");

        System.out.print("Hello World");
        System.out.print("Hello World");
        System.out.println("-----------");

        System.out.printf("Hello World", num);
        System.out.println("-----------");
        
        // short num1;
        // num = 25;
        // num1 = 26;
        // System.out.println(num);
        // System.out.println(num1);
        
        // char letter1 = '9';
        // System.out.println(letter1);

        // char letter2 = 65;
        // System.out.println(letter2);
    }
}
