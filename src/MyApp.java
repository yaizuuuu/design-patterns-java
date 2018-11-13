public class MyApp {
    public static void main(String[] args) {
        String msg = "\nHello \tWorld!";
        System.out.println(msg);

        char a = 'a';

        int x = 10;
        long y = 55555555555L;

        double d = 234234.3455;
        float f = 32.23F;

        boolean flag = true;

        int i;
        i = 10 / 3;
        System.out.println(i);
        i = 10 % 3;
        System.out.println(i);

        int z = 5;
        z++;
        System.out.println(z);
        z--;
        System.out.println(z);

        String s = "hello " + "World";
        System.out.println(s);

        double dob = 2234.233;
        int in = (int) dob;
        System.out.println(in);

        int ten = 10;
        double result = (double) ten / 4;
        System.out.println(result);

        int score = 95;

        if (score > 80) {
            System.out.println("great");
        } else if (score > 60) {
            System.out.println("good");
        } else {
            System.out.println("so so...");
        }

        String message = score > 80 ? "Greate" : "so so...";
        System.out.println(message);

        String signal = "green";

        switch (signal) {
            case "red":
                System.out.println("stop");
                break;

            case "blue":
            case "green":
                System.out.println("go");
                break;

            case "yellow":
                System.out.println("caution");
                break;

            default:
                System.out.println("wrong");
                break;
        }

        int number = 0;

        while (number < 10) {
            System.out.println(number);
            number++;
        }

        do {
            System.out.println(number);
            number++;
        } while (number < 10);

        for (int count = 0; count < 10; count++) {
            if (count == 5) {
//                break;
                continue;
            }
            System.out.println(count);
        }

        int[] sales;
        sales = new int[3];

        sales[0] = 100;
        sales[1] = 200;
        sales[2] = 300;

        System.out.println(sales[0]);

        sales[0] = 1000;
        System.out.println(sales[0]);

        int[] sales2;
        sales2 = new int[]{100, 200, 300};
        System.out.println(sales2[1]);

        int[] sales3 = {100, 200, 300};

        for (int index = 0; index < sales3.length; index++) {
            System.out.println(sales3[index]);
        }

        for (int sale : sales3) {
            System.out.println(sale);
        }
    }
}
