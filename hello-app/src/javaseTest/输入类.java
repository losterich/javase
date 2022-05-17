package javaseTest;

//导入包
import java.util.Scanner;
public class 输入类 {
    public static void main(String[] args) {
        //创建对象
        Scanner input = new Scanner(System.in);
        //接受数据
        String strInput = input.next();
        int intInput = input.nextInt();

        //输出输入的数据
        System.out.println(strInput+"年龄是"+intInput+"岁");

    }
}
