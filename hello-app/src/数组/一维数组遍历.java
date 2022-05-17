package 数组;

public class 一维数组遍历 {
    public static void main(String[] args) {
        // 静态初始化一维数组
        int []arr = {1,2,3,4,5,6};

        // 一维数组遍历
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");//1 2 3 4 5 6
        }
    }
}