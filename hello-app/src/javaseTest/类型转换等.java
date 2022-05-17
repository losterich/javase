package javaseTest;

public class 类型转换等 {
    public static void main(String[] args) {
     // 类型转换

     //数据范围小的可以直接赋值给数据范围大的
     int num1 = 2;
     double num2 = num1;
     //结果 2.0
     System.out.println(num2);

     //数据范围大的赋值给数据范围小的要进行强制转换
      double num3 = 4.56785;
      int num4 = (int)num3;
      //结果 4  （精度损失）
      System.out.println(num4);


      // 运算符

      // / 除 （取整：只取结果的整数部分）
      int num5 = 9;
      int num6 = 4;
      double num7 = num5 / num6;

      //结果 2
      System.out.println(num5/num6);
      System.out.println(num7);

        // % 取余：取余数（整除时取零）
      //结果 1
      System.out.println(num5%num6);


      // 字符 +  当 + 操作时 出现字符串,字符串以后的 + 就是连接符，没有出现字符串就是算数运算
        System.out.println("2"+4+3);
        System.out.println(4+3);

        //短路运算符
        // 逻辑与&，无论左边真假，右边都要执行。
        // 短路与&&，如果左边为真，右边执行；如果左边为假，右边不执行。
        // 逻辑或|，无论左边真假，右边都要执行。
        // 短路或||，如果左边为假，右边执行；如果左边为真，右边不执行。

        int num8 = 1;
        int num9 = 2;

        System.out.println((num8++ > 2) & (num9++ > 5));
        //结果 2
        System.out.println(num8);
        //结果 3
        System.out.println(num9);

        System.out.println((num8++ > 2) && (num9++ > 5));
        //结果 2
        System.out.println(num8);
        //结果 3 （没有在3的基础上加1）
        System.out.println(num9);


        //三元运算符
        int num10 = 2;
        int num11 = 3;
        System.out.println(num10 > num11 ? "正确":"错误");
    }
}
