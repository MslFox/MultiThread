package Netology.Multithread_Functional.Multithread;

import java.util.Arrays;

public class Main {
    private static int threadsCount = 4;
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("group");
        Arrays.stream(new MyThread[threadsCount]).
                map(x -> new MyThread(threadGroup,"Thread " + threadsCount-- )).
                forEach(MyThread::start);
        Thread.sleep(15000);
        threadGroup.interrupt();
    }
}
