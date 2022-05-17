package 方法;

public class return关键字 {
    public static void main(String[] args) {
        fun(100);
    }

    public static void fun(int a) {
        int b = 1;
        if(b == a){
            System.out.println(b);
            return;
        }
        b += b++;

    }
}
