package com.atguigu.SE8.InitialClassProcessTest;

/**
 * Description==>TODO
 * BelongsProject==>_01_JavaSE
 * BelongsPackage==>com.atguigu.SE8.InitialClassProcessTest
 * CreateTime==>2022-09-13 11:01:59
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class InitialTest01 {

    {
        System.out.println("俺是代码块...");
    }

    static{
        System.out.println("俺是静态代码块...");
    }

    public InitialTest01(){
        System.out.println("俺是构造器代码...");
    }

    public static void main(String[] args) {

        InitialTest01 initialTest01 = new InitialTest01();


    }

}



