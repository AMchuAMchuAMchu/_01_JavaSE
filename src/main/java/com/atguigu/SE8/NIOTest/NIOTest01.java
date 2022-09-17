package com.atguigu.SE8.NIOTest;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Description==>TODO
 * BelongsProject==>_01_JavaSE
 * BelongsPackage==>com.atguigu.SE8.NIOTest
 * CreateTime==>2022-09-17 19:47:09
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class NIOTest01 {

    @Test
    public void test01() throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\seldom\\rd\\Java_ProjectAll" +
                "\\Java_ProjectReview\\_01_JavaSE\\src\\main" +
                "\\java\\com\\atguigu\\SE8\\NIOTest\\assets\\_01_shadow_house.txt"));

        //这个读文件太舒服了啊啊啊啊....
        bufferedReader.lines().forEach(System.out::println);

        bufferedReader.close();




    }

}
