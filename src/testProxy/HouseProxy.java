package testProxy;

public class HouseProxy implements Rent{


    private Host host;
    public HouseProxy(Host host){
        this.host = host;
    }

    @Override
    public Object rentHouse(double money) {
        Object o = host.rentHouse(money);
        kanfang();
        kanjiahuanjia();
        weixiu();

        return o;
    }

    private void kanfang() {
        System.out.println("Help you search house source");
    }

    private void weixiu() {
        System.out.println("repair");
    }

    private void kanjiahuanjia() {
        System.out.println("sava your time, and save money");
    }
    
    //中介
}
