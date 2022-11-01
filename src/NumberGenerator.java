public class NumberGenerator implements Runnable {
    private Thread myThread;
    private int threadNumber;

    public int getThreadNumber() {
        return threadNumber;
    }

    public NumberGenerator(int num) {
        this.myThread = new Thread(this,"my thread");
        this.threadNumber = num;
        System.out.printf("Thread %d created\n", this.threadNumber);
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            System.out.printf("Thread %d runnable\n", this.threadNumber);
            int hashCode = hashCode();
            System.out.println("Thread " + this.threadNumber + " Hash code: " + hashCode);
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + this.threadNumber + " run: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + this.threadNumber + " over");
    }
}
