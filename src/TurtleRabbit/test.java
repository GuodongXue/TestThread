package TurtleRabbit;

public class test {
    public static void main(String[] args) {
        //乌龟的线程
        Tortoise tt = new Tortoise("Turtle_Thread");
        tt.start();

        //兔子的线程
        Rabbit rb = new Rabbit("Rabbit Thread");
        rb.start();

    }
}
