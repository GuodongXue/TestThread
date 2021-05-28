package TrainTickets;

public class test {
    public static void main(String[] args) {

        TrainTickets1 t1 = new TrainTickets1("Window 1");
        t1.start();
        TrainTickets1 t2 = new TrainTickets1("Window 2");
        t2.start();
        TrainTickets1 t3 = new TrainTickets1("Window 3");
        t3.start();
    }
}
