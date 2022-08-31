package com.atguigu.SE8.DateTimeTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.DateTimeTest
 * @Version: 1.0
 * @CreateTime: 2022-08-26 11:08:19
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class DateTimeTest02 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

        String format = dtf.format(now);

        System.out.println("01获取当前时间 >> "+format);

    }
}
