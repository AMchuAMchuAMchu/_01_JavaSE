package com.atguigu.SE8.DateTimeTest;

/**
 * Description==>TODO
 * BelongsProject==>_01_JavaSE
 * BelongsPackage==>com.atguigu.SE8.DateTimeTest
 * CreateTime==>2022-09-18 11:29:50
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class BenchmarkTest01 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        for (int i = 1; i <= 999999999; i++) {
        }

        long end = System.currentTimeMillis();

        System.out.println("耗时:"+(end-start)+"毫秒...");//耗时:1毫秒...耗时:2毫秒...耗时:1毫秒...

    }
}
