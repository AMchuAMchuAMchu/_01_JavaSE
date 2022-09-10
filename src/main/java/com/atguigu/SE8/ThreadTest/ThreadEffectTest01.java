package com.atguigu.SE8.ThreadTest;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * Description==>TODO
 * BelongsProject==>_01_JavaSE
 * BelongsPackage==>com.atguigu.SE8.ThreadTest
 * CreateTime==>2022-09-10 14:34:51
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class ThreadEffectTest01 {


    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        System.out.println(Runtime.getRuntime().availableProcessors());//获取可用的CPU数量....

        TTT01 ttt01 = new TTT01();


        CountDownLatch countDownLatch = new CountDownLatch(12);


        for (int i = 0; i < 12; i++) {
//            System.out.println("___");
            new Thread(() -> {
                try {
                    ttt01.saleT();
                } finally {
                    countDownLatch.countDown();
                }
            }).start();
        }

        countDownLatch.await();

//        ttt01.saleT();

        long end = System.currentTimeMillis();

        System.out.println("耗时::" + (end - start) + "毫秒...");//耗时::2558毫秒...耗时::2603毫秒...耗时::2480毫秒...

    }


}

class TTT01 {

    public static Integer tickets = 999999999;

    public synchronized void saleT() {

        for (; ;) {
//        while (true){
//            System.out.println(tickets--);
            tickets--;
            if (tickets <= 11) {//别写成tickets == 0 ,不然的话会因为虽然有现成到了0暂停了,但是的话其他线程的话会比一小依然是会执行下去的说^_^
                //并且的话会无限循环^_^
                return;
            }
        }

    }

}
