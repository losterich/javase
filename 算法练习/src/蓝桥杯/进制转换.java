//package 蓝桥杯;
///*
//问题描述
//　　给定n个十六进制正整数，输出它们对应的八进制数。
//输入格式
//　　输入的第一行为一个正整数n （1<=n<=10）。
//　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。
//输出格式
//　　输出n行，每行为输入对应的八进制正整数。
// */
//
//import java.util.Scanner;
//
//public class 进制转换 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        String []arr = new String[n];
//        String []strArr = new String[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.next();
//            strArr[i] = Integer.toString(arr[i],8);
//        }
//
//        for (String s : strArr) {
//            System.out.println(s);
//        }
//    }
//}
