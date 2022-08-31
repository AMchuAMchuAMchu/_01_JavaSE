package com.atguigu.SE8.JSONTest;

import com.alibaba.fastjson.JSON;
import com.atguigu.SE8.JSONTest.bean.Music01;
import com.google.gson.Gson;
import org.junit.Test;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.JSONTest
 * @Version: 1.0
 * @CreateTime: 2022-08-26 14:20:18
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class JSONTest01 {
    
    
    @Test
    public void test02(){

        Music01 chelly = new Music01("chelly", 2011);

        Object o = JSON.toJSON(chelly);

        System.out.println(" -> "+o);

        String lisa = "{\"singer\":\"Lisa\",\"time\":2012}";

        Music01 music01 = JSON.parseObject(lisa, Music01.class);

        System.out.println("-->"+music01.getSinger());




    }


    @Test
    public void test01(){

        Gson gson = new Gson();

        Music01 egoist = new Music01("EGOIST", 2012);

        String s = gson.toJson(egoist);

        System.out.println(" -> "+s);

        String e02 = "{\"singer\":\"supercell\",\"time\":2009}";

        Music01 music01 = gson.fromJson(e02, Music01.class);

        System.out.println(music01 instanceof Music01);

        System.out.println(music01.getSinger());


    }


}
