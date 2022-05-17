package 数组;

//导入包
import java.util.Random;

public class 随机点名 {
    public static void main(String[] args) {
        //创建对象
        Random rd = new Random();
        //创建数组
        String[] name = new String[]{"张三","李四","王五","张六麻子"};

        //生成随机值
        int num = rd.nextInt(name.length);
        //随机点名
        System.out.println(name[num]);



    }
}
