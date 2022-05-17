package 蓝桥杯;
/*
问题描述
　　给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
输入格式
　　第一行为一个整数n。
　　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
输出格式
　　输出一行，按从小到大的顺序输出排序后的数列。
 */
import java.util.*;

public class 数列排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt ();

        int [] arr = new int[n];
        // 以空格隔开，for循环遍历数组，接受输入的多个数字
        for (int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // Arrays.sort() 数组排序，参数：数组
        Arrays.sort(arr);
        // 增强型for循环，参数1：索引。参数2：数组。使用索引即可访问数组
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
