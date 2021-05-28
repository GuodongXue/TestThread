package TurtleRabbit;

public class Rabbit extends Thread{
    public Rabbit(String name) {
        super(name);
    }
    //重写run

    @Override
    public void run() {
        System.out.println("I am running, I did not rest"+this.getName());
    }
}
