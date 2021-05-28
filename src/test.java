public class test {
    public static void main(String[] args) {
        System.out.println("Main thread begins");
        testThread tt = new testThread();

        //Thread t = new Thread(tt);
        Thread t = new Thread(tt, "Minor");
        t.start();

        for(int i = 0; i<100; i++){
            System.out.println(Thread.currentThread().getName()+i);
        }

    }

}
