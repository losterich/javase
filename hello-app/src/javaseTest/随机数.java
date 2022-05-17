package javaseTest;

//导入包
import java.util.Scanner;
import java.util.Random;

public class 随机数 {
    public static void main(String[] args) {

        // 创建对象
        Scanner intInput = new Scanner(System.in);
        Random rom = new Random();

        // 输入的随机数范围
        System.out.print("请输入随机数范围最大值：");
        int max = intInput.nextInt();

        // 输出产生的随机数
        int random = rom.nextInt(max+1);
        System.out.print("产生的随机数为"+random);

    }
}
