package 数组;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = new int[] {56,23,42,21,66,77,88,45,21,44,11};
        int num = 0;

        //降序排列
        for (int i = 0;i < arr.length;i++) {
            for (int j = 0;j < arr.length -1 ;j++) {
                 if(arr[j] < arr[j+1]) {
                     num = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = num;
                 }
            }
        }

       System.out.print("降序排列：");
       for (int i = 0;i < arr.length;i++) {

           System.out.print(arr[i]+" ");
       }

        System.out.println("\n--------------------------------");


        //升序排列
        for (int i = 0;i < arr.length;i++) {
            for (int j = 0;j < arr.length -1 ;j++) {
                if(arr[j] > arr[j+1]) {
                    num = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = num;
                }
            }
        }
        System.out.print("升序排列：");
        for (int i = 0;i < arr.length;i++) {

            System.out.print(arr[i] + " ");
        }

    }
}
