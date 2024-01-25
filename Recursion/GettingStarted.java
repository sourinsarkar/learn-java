public class GettingStarted {
    // static void fun1() {
    //     System.out.println("This is Fun1");
    // }

    // static void fun2() {
    //     System.out.println("Before Fun1");
    //     fun1();
    //     System.out.println("After Fun1");
    // }

    // public static void main(String[] a) {
    //     System.out.println("Before Fun2");
    //     fun2();
    //     System.out.println("After Fun2");
    // }

    static void fun(int n){
        if(n == 0) return;
        System.out.println("Sourin");
        fun(n-1);
    }

    public static void main(String[] a) {
        fun(5);
    }
}
