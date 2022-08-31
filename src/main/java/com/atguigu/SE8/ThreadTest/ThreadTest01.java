package com.atguigu.SE8.ThreadTest;

import java.util.concurrent.*;

/**
 * 日期:2022/7/3  时间:14:54
 *
 * @author:02雪乃赤瞳楪祈雨宫天制作委员会 截图理解:0.0-0.0
 */
public class ThreadTest01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        T11 t11 = new T11();
//        T12 t12 = new T12();
//        t11.start();
//        t12.start();

//        T21 t21 = new T21();
//        T22 t22 = new T22();
//        Thread thread = new Thread(t21);
//        Thread thread1 = new Thread(t22);
//        thread.start();
//        thread1.start();

//        T31 t31 = new T31();
//        T32 t32 = new T32();
//        FutureTask<Object> integerFutureTask = new FutureTask<>(t31);
//        FutureTask<Object> integerFutureTask1 = new FutureTask<>(t32);
//        Thread thread = new Thread(integerFutureTask);
//        Thread thread1 = new Thread(integerFutureTask1);
//        thread.start();
//        thread1.start();
//        Object integer1 = integerFutureTask1.get();
//        Object integer = integerFutureTask.get();
//        System.out.println(thread.getName()+"==>"+integer);
//        System.out.println(thread1.getName()+"==>"+integer1);


        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.submit(()->{
            Thread.currentThread().setName("T41");
            for (int i = 0; i <= 100; i++) {
                System.out.println(Thread.currentThread().getName()+"::"+i);
            }
        });

        executorService.submit(()->{
            Thread.currentThread().setName("T42");
            for (int i = 0; i <= 100; i++) {
                System.out.println(Thread.currentThread().getName()+"::"+i);
            }
        });

        executorService.submit(()->{
            Thread.currentThread().setName("T43");
            for (int i = 0; i <= 100; i++) {
                System.out.println(Thread.currentThread().getName()+"::"+i);
            }
        });

        executorService.shutdown();//记得关闭一下资源的说O(∩_∩)O




    }

}

class T11 extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("T11");
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+"::"+i);
        }
    }
}

class T12 extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("T12");
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+"::"+i);
        }
    }
}

class T21 implements Runnable{

    @Override
    public void run() {
        Thread.currentThread().setName("T21");
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+"::"+i);
        }
    }
}

class T22 implements Runnable{

    @Override
    public void run() {
        Thread.currentThread().setName("T22");
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+"::"+i);
        }
    }
}

class T31 implements Callable<Object>{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        Thread.currentThread().setName("T31");
        for (int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println(Thread.currentThread().getName()+"::"+i);
        }
        return sum;
    }
}

class T32 implements Callable<Object>{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        Thread.currentThread().setName("T32");
        for (int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println(Thread.currentThread().getName()+"::"+i);
        }
        return sum;
    }
}





