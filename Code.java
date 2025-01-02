class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Computer {
    public void playMusic()
    {
        System.out.println("Music playing...");
    }

    public String getMePen(int cost)
    {
        if(cost >= 10)
            return "Pen";
        
        return "Nothing";
    }
}



public class Code {
    public static void main(String[] a) {
        Calculator obj = new Calculator();
        System.out.println("1st: " + obj.add(1, 2, 3));
        System.out.println("2nd: " + obj.add(1, 2));
    }
}
