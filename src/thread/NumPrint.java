package thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Yyang
 * @create 2018/12/10
 * @Describe
 */
public class NumPrint {
    private static Executor executor = new ThreadPoolExecutor(3, 6, 1000L,
            TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(10));

    private static ReentrantLock lock = new ReentrantLock();
    private static volatile int i = 0;

    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {
            executor.execute(() -> {
                while (true) {
                    lock.lock();
                    if (i <= 100) {
                        System.out.println(i++);

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }finally {
                            lock.unlock();
                        }
                    }
                }
            });
        }
    }
}
