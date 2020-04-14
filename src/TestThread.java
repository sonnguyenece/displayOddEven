public class TestThread {
    final static int LIMIT_NUMBER = 10;

    public static void main(String[] args) {
        OddThread odd = new OddThread(LIMIT_NUMBER);
        EvenThread even = new EvenThread(LIMIT_NUMBER);

        Thread threadOdd = new Thread(odd);
        Thread threadEven = new Thread(even);

        threadOdd.start();
        try {
            threadOdd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadEven.start();
    }

}
