package 方法;

public class 引用类型值传递 {
//    引用类型值传递的是一个内存地址，在方法中重新赋值时，会改变传入的值的变量
//    数组引用类型
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};

        //传入数组时，只用写一个数组名
        funArr(arr);
        System.out.println(arr[1]);

        String a = "PHP是最好的语言！！";
        funStr(a);
        System.out.println(a);

    }

    public static void funArr(int[] arr) {
        arr[1] = 4;
        System.out.println(arr[1]);


    }

    public static void funStr(String a) {
        a = "您说的不正确！";

        System.out.println(a);
    }

}
