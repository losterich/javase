package javaseTest;

public class 跳转控制语句 {
    public static void main(String[] args) {
        int num1 = 0;
        for (int num = 1;num <= 5;num++) {
            if ( num == 3) {
                System.out.println(num1+"循环打破");
                continue;
            }

            num1++;
            System.out.println(num1+"循环中");
        }

        System.out.println("-------------------");

        int num2 = 1;
        for (int num = 1;num <= 5;num++) {
            if ( num == 3) {
                System.out.println(num2+"循环终止");
                break;
            }

            num2++;
            System.out.println(num2+"循环中");
        }
    }
}
