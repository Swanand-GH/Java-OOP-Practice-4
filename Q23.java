class Message {

    String message;

    synchronized void getMessage() throws InterruptedException {

        System.out.println("Waiting for message...");

        wait();

        System.out.println("Message received: " + message);
    }

    synchronized void sendMessage() {

        message = "Hello Student";

        notify();
    }
}

class Q23 {
    public static void main(String[] args) throws InterruptedException {

        Message obj = new Message();

        Thread t1 = new Thread(() -> {
            try {
                obj.getMessage();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        });

        Thread t2 = new Thread(() -> {
            obj.sendMessage();
        });

        t1.start();

        Thread.sleep(100);

        t2.start();

        t1.join();
        t2.join();
    }
}
