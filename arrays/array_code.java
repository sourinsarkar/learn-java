// import java.util.Arrays;

class array_code {
    public static void main(String[] args) {
        // int[] some = new int[5];
        // some[0] = 10;
        // some[1] = 20;
        // some[2] = 30;
        // some[3] = 40;
        // some[4] = 50;

        // System.out.println(some[0]); 

        // int count = 0;
        // for(int thing: some) {
        //     System.out.println("Index: " + count);
        //     System.out.println("Value: " + thing);
        //     count++;
        // }

        // Multi-dimensional Arrays -----------------

        // int[][] multi = new int[3][4];

        // Copy of an array -------------------------

        // int[] numbers = {100,200,300,400,500};
        // int[] new_numbers = numbers;
        // int[] new1 = new int[numbers.length];

        // for(int items: numbers) {
        //     System.out.println(items);
        // }

        // System.out.println();
        
        // for(int items: new_numbers) {
        //     System.out.println(items);
        // }
        
        // System.out.println();

        // int i = 0;
        // for(int items: numbers) {
        //     new1[i] = items;
        //     i++;
        // }

        // for(int items: new1) {
        //     System.out.println(items);
        // }

        // --------------------------------------

        int[] n1 = {2, 3, 12, 4, 12, -2};
        int[] n2 = new int[n1.length];
        // System.out.println(n1.length);
        // System.out.println(n2.length);
        // System.out.println(n2[2]);
        // n2[2] = 23;
        // System.out.println(n2[2]);

        System.arraycopy(n1, 0, n2, 0, n1.length);

        for (int j : n2) {
            System.out.print(j);
        }   
    }
}