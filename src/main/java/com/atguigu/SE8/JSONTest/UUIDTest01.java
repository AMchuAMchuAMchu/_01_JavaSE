package com.atguigu.SE8.JSONTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.JSONTest
 * @Version: 1.0
 * @CreateTime: 2022-08-26 14:03:13
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class UUIDTest01 {
    public static void main(String[] args) {

        HashMap<String, String> animeMap = new HashMap<>();

        animeMap.put(UUID.randomUUID().toString(),"SAO");

        animeMap.put(UUID.randomUUID().toString(),"fate");

        animeMap.put(UUID.randomUUID().toString(),"地错");

        animeMap.entrySet().forEach(System.out::println);

    }
}
