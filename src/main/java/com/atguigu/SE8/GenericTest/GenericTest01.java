package com.atguigu.SE8.GenericTest;

import com.atguigu.SE8.GenericTest.bean.Anime03;
import com.atguigu.SE8.GenericTest.bean.Anime04;
import org.junit.Test;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.GenericTest
 * @Version: 1.0
 * @CreateTime: 2022-09-01 14:34:54
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class GenericTest01 {


    @Test
    public void test02(){

        Anime03<Anime04> anime04Anime03 = new Anime03<>();

        Anime04 anime04 = new Anime04("夏岛悬疑", 2018);

        anime04Anime03.setAnimeName(anime04);

        System.out.println(anime04Anime03.getAnimeName());

    }


    @Test
    public void test01(){

        Anime03<String> stringAnime03 = new Anime03<>();

        stringAnime03.setAnimeName("罪恶王冠");

        System.out.println(stringAnime03.getAnimeName());


    }

}
