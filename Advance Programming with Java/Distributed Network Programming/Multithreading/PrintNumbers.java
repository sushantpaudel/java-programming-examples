// •	Write a Java program that creates two threads. One thread should print even numbers, and the other should print odd numbers in a synchronized manner

public class PrintNumbers {
    public static void main(String[] args) {
        NumberPrinter evenPrinter = new NumberPrinter(true);
        NumberPrinter oddPrinter = new NumberPrinter(false);

        Thread evenThread = new Thread(evenPrinter);
        Thread oddThread = new Thread(oddPrinter);

        evenThread.start();
        oddThread.start();
    }
}

class NumberPrinter implements Runnable {
    private boolean isEven;

    public NumberPrinter(boolean isEven) {
        this.isEven = isEven;
    }

    @Override
    public void run() {
        for (int i = isEven ? 2 : 1; i <= 10; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
