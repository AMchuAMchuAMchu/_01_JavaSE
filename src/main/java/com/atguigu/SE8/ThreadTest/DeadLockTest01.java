package com.atguigu.SE8.ThreadTest;

import java.lang.ref.SoftReference;
import java.util.concurrent.TimeUnit;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.ThreadTest
 * @Version: 1.0
 * @CreateTime: 2022-08-29 18:06:16
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class DeadLockTest01 {


    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> aClass = Class.forName("com.atguigu.SE8.ThreadTest.DeadLockTest01");

        SoftReference<Object> obj01 = new SoftReference<Object>(aClass);

        SoftReference<Object> obj02 = new SoftReference<Object>(aClass);

        new Thread(() -> {
            synchronized (obj01) {
                System.out.println("obj01...");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj02) {
                    System.out.println("obj02...");
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (obj02) {
                System.out.println("obj02...");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj01) {
                    System.out.println("obj01...");
                }
            }
        }).start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("(；′⌒`)发生死锁...程序将即将关闭...");
            System.exit(-1);
        }

    }
}
