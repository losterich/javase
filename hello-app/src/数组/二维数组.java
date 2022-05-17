package 数组;

public class 二维数组 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];

//        for(int i = 0;i < 3;i ++) {
//           for(int j = 0;j < 4;j ++) {
//               arr[i][j] = i + j;
//               System.out.println(arr[i][j]);
//           }
//        }

        // arr指的是最外层数组，arr[0]指的是第一个子数组，
        // arr[1]指的是第二个子数组，以此类推。

        //数组越界，索引最大为2
        System.out.println(arr[3].length);

    }
}
