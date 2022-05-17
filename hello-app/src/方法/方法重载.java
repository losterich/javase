package 方法;

public class 方法重载 {
//    同一个类中，有多个方法的方法名相同，但是形参列表不同，这些方法就是重载方法
//    重载方法会根据传入的参数不同调用不同的方法
    public static void main(String[] args) {
        fire();
        fire("毛国");
        fire("澳国",10000);

    }

    public static void fire() {
        //默认发射
        System.out.println("给米国发射一枚核弹");
    }

    //指定地区发射一枚核弹
    public static void fire (String location) {
        System.out.println("给" + location + "发射一枚核弹");
    }

    //给指定地区发射指定数目的核弹
    public static void fire(String location,int num) {
        System.out.println("给" + location + "发射"+ num +"枚核弹");
    }
}
