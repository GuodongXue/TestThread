package TrainTickets;

public class TrainTickets1 extends Thread{
    //属性
    private static int ticketNum = 10;
    //设置线程（窗口）的名字
    public TrainTickets1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 1; i<=10; i++){
            if(ticketNum>0){
                System.out.println("I bought tickets from "+this.getName()+", 并且还剩"+(--ticketNum));
            }
        }
    }
}
