package 蓝桥杯;

import java.util.Arrays;

public class 常用api {
    public static void main(String[] args) {

        //  比较字符串是否相同,obj.equals()
        String str1 = "abc123";
        String str2 = "abc123";
        String str3 = "abc1";
        System.out.println(str1.equals(str2));

        // 返回字符位置,注意传入的参数, boj.indeOf()
        String str = "1234efgh";
        System.out.println(str.indexOf("3"));

        // 用索引遍历字符串, obj.charAt()
        String str4 = "uerhwuewh12";
        for (int i = 0; i < str4.length() ; i++) {
            System.out.print(str4.charAt(i) + " ");
        }

        // 分割字符串 obj.split("字符",int 份数);
        String []strArr = str.split("e");
        for (String num:strArr) {
            System.out.println(num);
        }


        // Math类
        //  返回绝对值，Math.abs()
        int a = -1;
        int b = 4;
        System.out.println(Math.abs(a));
        // 比较两个值的大小 Math.max()
        System.out.println(Math.max(a,b));
        // 乘方运算,Mat.pow(a,b),返回一个double值
        System.out.println(Math.pow(2,3));
        // 开方运算，Math.sqrt(),返回一个double值
        System.out.println(Math.sqrt(16));

        // 数组排序
        int []sortArr = {34,33,67,1,3,0,12};
        Arrays.sort(sortArr);
        // 升序·
        for (int num:sortArr) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
        // 降序
        for (int i = sortArr.length - 1; i >= 0; i--) {
            System.out.print(sortArr[i] + " ");

        }

    }
}
