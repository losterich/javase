package 方法;

public class 方法参数返回 {
    public static void main(String[] args) {
        String str = fun("java") + "  " + fun1();

        System.out.println(str);

    }

    public static String fun(String a) {
        String str = a + "牛逼";

        return str;
    }

    public static String fun1() {
        return "是真的牛逼！！";
    }
}
