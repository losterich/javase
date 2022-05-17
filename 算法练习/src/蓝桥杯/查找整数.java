package 蓝桥杯;

import java.util.*;

public class 查找整数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        int []arr =new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int goalNum = sc.nextInt();
        for (int i = 0; i < num; i++) {
            if(arr[i] == goalNum){
                System.out.println(i + 1);
                return;
            }

        }
        System.out.println(-1);
    }
}
