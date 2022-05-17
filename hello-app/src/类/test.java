package 类;

public class test {
    public static void main(String[] args) {
        //
        Car c = new Car();

        c.name = "宝马";
        c.price = 90;

        Car c1 = new Car("奔驰",123);

        System.out.println(c.name + c.price);

        System.out.println(c1.name + c1.price);

    }
}
