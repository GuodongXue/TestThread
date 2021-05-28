package testProxy;

public class Host implements Rent{
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Host(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object rentHouse(double money) {

        System.out.println("Rent, and you pay"+money);
        return new Object();
    }
}
