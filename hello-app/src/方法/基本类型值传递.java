package 方法;

public class 基本类型值传递 {
//    基本类型的值传递传递的是 值本身，而不是变量本身
//    所以在方法中重新赋值时，不会改变传入的变量的值

    public static void main(String[] args) {
        int a = 10;
        fun(a);
        System.out.println(a);
    }
    public static int fun (int a) {
        a = 25;
        System.out.println(a);

        return a;
    }
}
