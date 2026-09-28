class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }
}

class Q16 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        System.out.println("Thread is starting.");
        t.start();
        t.join();
        System.out.println("Thread has completed.");
    }
}
