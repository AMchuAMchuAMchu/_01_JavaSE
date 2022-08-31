package com.atguigu.SE8.SerializableTest;

import com.atguigu.SE8.SerializableTest.bean.Anime01;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.SerializableTest01
 * @Version: 1.0
 * @CreateTime: 2022-08-26 12:31:31
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class SerializableReadTest01 {

    public static void main(String[] args) throws Exception {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\seldom\\rd\\Java_ProjectAll\\Java_ProjectReview\\_01_JavaSE\\java\\com\\atguigu\\SE8\\SerializableTest01\\assets\\anime01.txt"));

        Anime01 o = (Anime01)ois.readObject();

        System.out.println("anime01.txt >> "+o);


    }

}
