class First extends Thread {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("First Thread");
        }
    }
}

class Second extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Second Thread");
        }
    }
}

class Q15 {
    public static void main(String[] args) throws InterruptedException {
        First t1 = new First();
        Second t2 = new Second();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }
}