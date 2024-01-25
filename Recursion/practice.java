public class practice {
    static void fun1(int n)
    {
        if(n == 0) return;
        System.out.println(n);
        fun1(n - 1);
        System.out.println(n);
    }

    static void fun2(int n)
    {
        if(n == 0) return;
        fun2(n - 1);
        System.out.println(n);
        fun2(n - 1);
    }

    static int fun3(int n)
    {
        if(n == 1)
            return 0;
        else
            return 1 + fun3(n/2);
    }

    public static void main(String[] a)
    {
        System.out.println(fun3(16));
    }
}