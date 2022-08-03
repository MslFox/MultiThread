package Netology.Multithread_Functional.Multithread;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int[] intRandomArr = intRandomArrGreater(2_000_000_000);//_000_000);

        MyRecursiveTask myRecursiveTask = new MyRecursiveTask(0, intRandomArr.length - 1, intRandomArr);

        System.out.println("\nСтарт streamSum()....");
        long begin = System.currentTimeMillis();
        System.out.println("Результат " + myRecursiveTask.streamSum());
        System.out.println("Время выполнения: " + (double) (System.currentTimeMillis() - begin) / 1000 + "сек.");

        System.out.println("\nСтарт cycleSum()....");
        begin = System.currentTimeMillis();
        System.out.println("Результат " + myRecursiveTask.cycleSum());
        System.out.println("Время выполнения: " + (double) (System.currentTimeMillis() - begin) / 1000 + "сек.");

        ForkJoinPool forkJoinPool = new ForkJoinPool();

        System.out.println("\nСтарт recursionSum()....");
        begin = System.currentTimeMillis();
        System.out.println("Результат " + forkJoinPool.invoke(myRecursiveTask));
        System.out.println("Время выполнения: " + (double) (System.currentTimeMillis() - begin) / 1000 + "сек.");

        forkJoinPool.shutdown();
    }

    private static int[] intRandomArrGreater(int arrSize) {
        System.out.println("Создание int[" + arrSize + "].....\nОжидайте.....");
        int[] intRandomArr = new int[arrSize];
        Random random = new Random();
        for (int i = 0; i < arrSize; i++) {
            intRandomArr[i] = random.nextInt(1, 10);
        }
        System.out.println("Массив создан");
        return intRandomArr;
    }

}
