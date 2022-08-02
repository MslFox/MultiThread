package Netology.Multithread_Functional.Multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<MyCallable> myCallables = new ArrayList<>();
        for (int i = 1; i <= 10 ; i++) {
            myCallables.add(new MyCallable("Thread " + i, 4 ));
        }
        ExecutorService threadPoll =  Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        System.out.println("\nБыстрее всех был: " + threadPoll.invokeAny(myCallables).getName() + "\n");
        threadPoll.shutdown();
    }
}
