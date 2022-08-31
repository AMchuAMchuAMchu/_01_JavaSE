package com.atguigu.SE8.SerializableTest;

import com.atguigu.SE8.SerializableTest.bean.Anime01;

import java.io.*;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.SerializableTest01
 * @Version: 1.0
 * @CreateTime: 2022-08-26 12:16:20
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class SerializableWriteTest01 {
    public static void main(String[] args) throws Exception {

        String path = "D:\\seldom\\rd\\Java_ProjectAll\\Java_ProjectReview\\_01_JavaSE\\java\\com\\atguigu\\SE8\\SerializableTest01\\assets\\anime01.txt";

        FileOutputStream fos = new FileOutputStream(path);

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Anime01 anime01 = new Anime01("咒术回战",202010);

        oos.writeObject(anime01);

        oos.flush();

        oos.close();








    }
}
