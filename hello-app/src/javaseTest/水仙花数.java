package javaseTest;

public class 水仙花数 {

    public static void main(String[] args) {

        int n = 0;
        for (int i = 100;i <= 999;i++) {
            int num1 = i / 100;
            int num2 = (i - num1*100) / 10;
            int num3 = (i - num1*100 - num2*10 ) / 1;

            if (num1 * num1 * num1
                + num2 * num2 * num2
                + num3 * num3 * num3 == i) {

                System.out.println(i);
                n++;

            }
        }
        System.out.println(n);
    }
}
