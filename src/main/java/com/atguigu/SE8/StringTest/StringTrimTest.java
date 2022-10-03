package com.atguigu.SE8.StringTest;

import jdk.internal.cmm.SystemResourcePressureImpl;
import org.junit.Test;

import java.util.Scanner;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSE
 * BelongsPackage ==> com.atguigu.SE8.StringTest
 * Version ==> 1.0
 * CreateTime ==> 2022-10-03 09:03:00
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class StringTrimTest {

    public static void main(String[] args) {

        System.out.println("请输入...🍹🍹");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println("客观您输入的长度是 >> "+input.length()+"厘米");

        String result = input.trim();

        System.out.println("处理之后的真实长度 >> "+result.length()+"毫米");

    }

}
