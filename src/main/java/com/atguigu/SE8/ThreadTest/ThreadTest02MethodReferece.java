package com.atguigu.SE8.ThreadTest;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.ThreadTest
 * @Version: 1.0
 * @CreateTime: 2022-09-07 14:50:20
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class ThreadTest02MethodReferece {

    public static Integer tickets = 100;


    @SneakyThrows(Exception.class)
    public void saleTickets() {

        for (int i = 1; i <= 40; i++) {
            if (tickets > 0) {
                TimeUnit.MICROSECONDS.sleep(200);
                System.out.println(Thread.currentThread().getName() + "::售出第 " + tickets-- + " 张票");
            } else {
                System.out.println("果咩纳塞~~售完了喔...:-)");
            }
        }
    }

    public static void main(String[] args) {

        ThreadTest02MethodReferece tTMR02 = new ThreadTest02MethodReferece();

        for (int i = 1; i <= 3; i++) {
            new Thread(tTMR02::saleTickets).start();
        }

    }



}
