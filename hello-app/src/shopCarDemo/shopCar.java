package shopCarDemo;

import java.util.Scanner;

public class shopCar {
    public static void main(String[] args) {
        // 1.定义商品类，用于创建商品对象
        // 2.定义购物车对象，使用一个数组对象表示
        Goods [] shopCar = new Goods[100];

        // 快捷键：ctrl + alt + T 快速添加环绕方式

        while (true) {
            // 3.搭建操作架构
            System.out.println("请您选择如下命令进行操作");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询商品到购物车：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算购买商品的金额：pay");

            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入命令：");

            String command = sc.next();

            switch (command){
                case "add":
                    // 添加商品到购物车
                    addGoods(shopCar,sc);
                    break;
                case "query":
                    // 查询购物车商品展示
                    queryGoods(shopCar,sc);
                    break;
                case "update":
                    // 修改商品购买数量
                    updateGoods(shopCar,sc);
                    break;
                case "pay":
                    // 结算购买商品的金额
                    payGoods(shopCar,sc);
                    break;

                // 匹配不成功
                default:
                    System.out.println("没有该功能！");
                    break;
            }
            System.out.println("==================================================");
        }
    }

    // 快捷键：alt + enter 快速创建方法
    /**
     *添加商品到购物车
     */
    public static void addGoods(Goods[] shopCar,Scanner sc) {
        // 1.录入用户输入的购买商品的信息
        System.out.println("请您输入购买商品的编号：");
        int id = sc.nextInt();
        System.out.println("请您输入购买商品的名称：");
        String name = sc.next();
        System.out.println("请您输入购买商品的数量：");
        int buyNumber = sc.nextInt();
        System.out.println("请您输入购买商品的价格：");
        double price = sc.nextDouble();

        // 2.把这个购买商品的信息封装成一个商品对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.buyNumber = buyNumber;
        g.price = price;

        // 3.把这个商品对象添加到购物车数组中
        // 数组遍历 ： shopCar.fori
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i] == null) {
                // 说明此处没有元素存入，可以添加商品
                shopCar[i] = g;
                break;// 停止循环
            }
        }
        System.out.println("您的商品" + g.name + "添加到购物车成功！");
    }

    public static void queryGoods(Goods[] shopCar,Scanner sc) {
        System.out.println("===================查询购物车如下===================");
        System.out.println("编号\t\t名称\t\t\t价格\t\t\t购买数量");

        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if(g != null){
                System.out.println(g.id + "\t\t" + g.name + "\t\t" + "￥" +g.price + "\t\t\t" + g.buyNumber);
            }else {
                break;
            }
        }
    }

    public static void updateGoods(Goods[] shopCar,Scanner sc) {
        // 根据用户输入要修改的商品id，修改制定的商品
        while (true) {
            System.out.println("请您输入要修改的商品id：");
            int id = sc.nextInt();

            Goods g = getGoodsById(shopCar,id);
            if(g == null) {
                System.out.println("商品不存在");
            }else {
                System.out.println("请您输入" + g.name + "最新购买数量：");
                int buyNumber = sc.nextInt();
                g.buyNumber = buyNumber;
                System.out.println("修改成功");
                queryGoods(shopCar,sc);
                break;
            }
        }

    }

    public static Goods getGoodsById (Goods[] shopCar,int id){
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];

            if(g != null){
                if(g.id == id){
                    return g;
                }else {
                    return null;
                }
            }
        }
        return null;
    }


    public static void payGoods(Goods[] shopCar,Scanner sc) {
        System.out.println("编号\t\t名称\t\t\t价格\t\t\t购买数量");
        double sumPrice = 0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];

            if(g != null){
                sumPrice += g.price * g.buyNumber;
                System.out.println(g.id + "\t\t" + g.name + "\t\t" + "￥" +g.price + "\t\t\t" + g.buyNumber);
            }else {
                break;
            }

        }
        System.out.println("商品总价为：" + sumPrice);

    }


}
