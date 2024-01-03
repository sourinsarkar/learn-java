class loop_code {
    public static void main(String[] args) {
        int number = 5;
        // number = -10;
        // if(number < 0) {
        // System.out.println("Negative");
        // } else if(number > 0) {
        // System.out.println("Positive");
        // } else {
        // System.out.println("Equal");
        // }

        // switch (number) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Noday");
        //         break;
        // }

        int[] newarr = {100,200,300,400,500};
        int sum = 0;
        for(int item: newarr) {
            sum += item;
        }

        System.out.println(sum);
    }
}
