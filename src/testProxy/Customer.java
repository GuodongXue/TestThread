package testProxy;

public class Customer {
    public static void main(String[] args) {
        //Host h = new Host("张三", "hUILONGGUAN");
        //Object o = h.rentHouse(2500.88);
        //System.out.println(o);

        HouseProxy hp = new HouseProxy(new Host("zhangsan", "dinghai"));
        Object o = hp.rentHouse(2333.89);
    }
}
