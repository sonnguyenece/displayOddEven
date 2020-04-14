public class OddThread implements Runnable {
    private int number;

    OddThread(int number) {
        this.number = number;
    }

    @Override
    synchronized public void run() {
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
