package Netology.Multithread_Functional.Multithread;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Long> {
    private static final int MAX_ACTIVATE_THREADS = 6;
    private final int start;
    private final int end;
    private final int[] intRandomArr;
    private long result;

    public MyRecursiveTask(int start, int end, int[] intRandomArr) {
        this.start = start;
        this.end = end;
        this.intRandomArr = intRandomArr;
    }

    @Override
    protected Long compute() {
        if (Thread.activeCount() >= MAX_ACTIVATE_THREADS) {
            return cycleSum();
        }
        if (end - start == 0) {
            return (long) intRandomArr[start];
        }
        if (end - start == 1) {
            return (long) intRandomArr[start] + intRandomArr[end];
        } else {
            return recursionSum();
        }
    }

    protected Long recursionSum() {
        final int middle = (end - start) / 2 + start;
        MyRecursiveTask right = new MyRecursiveTask(start, middle, intRandomArr);
        MyRecursiveTask left = new MyRecursiveTask(middle + 1, end, intRandomArr);
        invokeAll(right, left);
        return (long) right.join() + left.join();
    }

    public Long cycleSum() {
        result = 0;
        for (int i = start; i <= end; i++) {
            result += intRandomArr[i];
        }
        return result;
    }

    public Long streamSum() {
        result = 0;
        Arrays.stream(intRandomArr).forEach(x -> result += x);
        return result;
    }

}
