public class EvenThread implements Runnable {
    private int number;

    EvenThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

