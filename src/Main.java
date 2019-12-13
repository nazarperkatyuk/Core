public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();

        myThread.join();

        RunnableThread runnableThread = new RunnableThread();
        new Thread(runnableThread).start();


    }

}