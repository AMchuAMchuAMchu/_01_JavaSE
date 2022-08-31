package com.atguigu.SE8.ExceptionTest;

import java.text.BreakIterator;
import java.util.Scanner;

/**
 * 日期:2022/7/3  时间:16:41
 *
 * @author:02雪乃赤瞳楪祈雨宫天制作委员会 截图理解:0.0-0.0
 */
public class ExceptionTest01 {
    public static void main(String[] args) {

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第一个数:");
            int i1 = scanner.nextInt();
            System.out.println("请输入第二个数:");
            int i2 = scanner.nextInt();
            new A().calc(i1,i2);
        }

    }
}

class A{

    public void calc(Integer num02,Integer num01){
        if (num01 >= 0 && num02 >= 0){
            int sum = num01 + num02;
            System.out.println("输入正确!!^_^得出结果!!(≧∇≦)ﾉ==>"+sum);
        }else{
            try {
                throw new MyExceptionTest(num01,num02);
            } catch (MyExceptionTest myExceptionTest) {
                System.out.println(myExceptionTest);
            }
        }
    }



}


class MyExceptionTest extends Exception{
    private Integer num01;
    private Integer num02;
    private static Integer times = 0;

    public MyExceptionTest(Integer num01, Integer num02) {
        this.num01 = num01;
        this.num02 = num02;
    }

    public String toString(){
        times++;

        System.err.println("警告"+times+"次!!!(•́へ•́╬)num01或者是num02输入异常！！！(•́へ•́╬)num01::"+num01+"num02::"+num02);
        System.err.println("警告"+times+"次!!!(•́へ•́╬)num01或者是num02输入异常！！！(•́へ•́╬)num01::"+num01+"num02::"+num02);
        System.err.println("警告"+times+"次!!!(•́へ•́╬)num01或者是num02输入异常！！！(•́へ•́╬)num01::"+num01+"num02::"+num02);
        return "num01或者是num02输入异常！！！(•́へ•́╬)";
    }
}



