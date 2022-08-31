package com.atguigu.SE8.ThreadTest;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.ThreadTest
 * @Version: 1.0
 * @CreateTime: 2022-08-29 17:55:09
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class ThreadTest02 {

    static int ticket = 0;

    static void add() {
        for (int i = 1; i <= 10; i++) {
            try {
                //这里的话记得这个时间是恰到好处的说,和下面的休眠时间记得对应上来O(∩_∩)O哈哈~
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket++;
        }

    }

    public static void main(String[] args) {

        //方式一 :>> 传统的方式的说....三次都是:20^_^
//        add();
//
//        add();
//
//        System.out.println(ticket);


        //方式二 :>> 并发的情况下:

        new Thread(()->{
            add();
        },"T1").start();

        new Thread(()->{
            add();
        },"T2").start();

        //等上面两个线程运算完之后再获取结果
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(ticket);//14 16 15

    }
}
