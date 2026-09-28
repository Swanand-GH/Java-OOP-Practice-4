class MyRunnable implements Runnable {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello Student");
        }
    }
}
class Q10 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        t.start();
        t.join();
        System.out.println("Main thread completed.");
    }
}