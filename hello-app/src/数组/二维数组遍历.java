package 数组;

public class 二维数组遍历 {
    public static void main(String[] args) {
        // 静态初始化二维数组
        int [][] arr = {{1,2,3},{4,5},{6,7,8},{9,10,11,12,13}};

        // 二维数组遍历
        // arr指的是最外层数组，arr[0]指的是第一个子数组，
        // arr[1]指的是第二个子数组，以此类推。
        for (int i = 0; i < arr.length;i++){
            for (int j = 0;j < arr[i].length;j++ ) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
