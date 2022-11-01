public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator(1);
        NumberGenerator numberGenerator2 = new NumberGenerator(2);
        numberGenerator2.getMyThread().setPriority(Thread.MAX_PRIORITY);
        numberGenerator1.getMyThread().setPriority(4);
        System.out.println("Priority thread " + numberGenerator1.getThreadNumber() + " is: " + numberGenerator1.getMyThread().getPriority());
        System.out.println("Priority thread " + numberGenerator2.getThreadNumber() + " is: " + numberGenerator2.getMyThread().getPriority());
        numberGenerator1.getMyThread().start();
        numberGenerator2.getMyThread().start();
    }
}