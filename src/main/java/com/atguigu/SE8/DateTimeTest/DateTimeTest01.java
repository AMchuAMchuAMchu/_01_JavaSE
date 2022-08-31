package com.atguigu.SE8.DateTimeTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.DateTimeTest
 * @Version: 1.0
 * @CreateTime: 2022-08-26 10:41:46
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class DateTimeTest01 {
    public static void main(String[] args) throws Exception {

        Date date = new Date();

        System.out.println("01时间戳 >> "+date.getTime());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String format = simpleDateFormat.format(date.getTime());

        System.out.println("02时间戳格式化为字符串 >> "+format);

        Scanner scanner = new Scanner(System.in);

//        System.out.println("请输入...^_^");

        String s = scanner.nextLine();

        Date stamp = simpleDateFormat.parse(s);

        System.out.println("03字符串转换为时间戳 >> "+stamp.getTime());

    }
}
