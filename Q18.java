class LowPriority extends Thread {

    public void run() {
        System.out.println(getName() + " = " + getPriority());
    }
}

class HighPriority extends Thread {

    public void run() {
        System.out.println(getName() + " = " + getPriority());
    }
}

class Q18 {
    public static void main(String[] args) throws InterruptedException {

        LowPriority t1 = new LowPriority();
        HighPriority t2 = new HighPriority();

        t1.setName("LowPriority");
        t2.setName("HighPriority");

        t1.setPriority(3);
        t2.setPriority(8);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        System.out.println("Both threads completed.");
    }
}
