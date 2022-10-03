package com.atguigu.SE8.CollectionTest;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Description ==> TODO
 * BelongsProject ==> _01_JavaSE
 * BelongsPackage ==> com.atguigu.SE8.CollectionTest
 * Version ==> 1.0
 * CreateTime ==> 2022-10-03 08:55:41
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class PropertiesTest {

    @Test
    public void testPropReadProfile() throws IOException {

        InputStream ra = PropertiesTest.class.getClassLoader().getResourceAsStream("jdbc.properties");

        Properties prop = new Properties();

        prop.load(ra);

        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        String animeList = prop.getProperty("animeList");

        System.out.println("username >> "+username);
        System.out.println("password >> "+password);
        System.out.println("animeList >> "+animeList);

    }


}
