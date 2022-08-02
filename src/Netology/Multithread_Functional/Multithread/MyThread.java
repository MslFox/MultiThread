package Netology.Multithread_Functional.Multithread;

class MyThread extends Thread {
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Всем привет!" + getName());
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}