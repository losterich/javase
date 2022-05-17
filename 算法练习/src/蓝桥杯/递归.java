package 蓝桥杯;

import java.util.Arrays;
import java.util.Scanner;

public class 递归 {
    public static void main(String[] args) {
       int result = jiecheng(4);
       System.out.println(result);
    }
    public static int jiecheng(int num){
       if(num == 1){
           return 1;
       }else {
           int sum;
           sum = num * jiecheng(num - 1);
           return sum;
       }
    }
}
