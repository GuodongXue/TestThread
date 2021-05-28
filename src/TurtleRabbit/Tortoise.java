package TurtleRabbit;

public class Tortoise extends Thread {
    //设置线程的名字
    public Tortoise(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true){
            System.out.println("I am runing, I am ahead"+this.getName());
        }
    }
}
