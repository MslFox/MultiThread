package Netology.Multithread_Functional.Multithread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<MyCallable> {
    private String name;
    private int iterationValue;

    public MyCallable(String name, int iterationValue ) {
        this.name = name;
        this.iterationValue = iterationValue;
    }

    @Override
    public MyCallable call() throws InterruptedException {
        int count = 0;
            while (count < iterationValue) {
                Thread.sleep(2500);
                System.out.println("Всем привет! от " + name);
                count++;
            }
        System.out.println( name + ". Завершен");
        return this;
    }

    public String getName() {
        return name;
    }
}
