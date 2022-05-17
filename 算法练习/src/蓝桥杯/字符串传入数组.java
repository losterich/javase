package 蓝桥杯;

import java.util.*;
public class 字符串传入数组 {
    public static void main(String[] args) {
    String str = "tretertert432423";
    fun1(str);
    }

// 将字符串存入数组

// 方法一
public static void fun1(String str){
    char []arr = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
        arr[i] = str.charAt(i);
    }
    // for(数组类型 变量名 ： 数组)
    for (char num:arr) {
        System.out.print(num + " ");
    }
}
}
