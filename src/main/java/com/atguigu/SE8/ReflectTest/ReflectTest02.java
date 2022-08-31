package com.atguigu.SE8.ReflectTest;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.ReflectTest
 * @Version: 1.0
 * @CreateTime: 2022-08-26 15:30:37
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class ReflectTest02 {


    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();

//        InputStream ras = ClassLoader.getSystemClassLoader().getResourceAsStream("D:\\seldom\\rd\\Java_ProjectAll\\Java_ProjectReview\\_01_JavaSE\\src\\main\\resources\\jdbc.properties");
        InputStream ras = ClassLoader.getSystemClassLoader().
                getResourceAsStream
                        ("jdbc.properties");



        prop.load(ras);

        String username = prop.getProperty("username");

        String password = prop.getProperty("password");

        System.out.println("username"+username);

        System.out.println("password"+password);




    }


    @Test
    public void test02() throws Exception{

        Properties prop = new Properties();

        InputStream ras = ClassLoader.getSystemClassLoader()
                .getResourceAsStream
        ("jdbc.properties");

//        InputStream ras = ReflectTest02.class.getClassLoader().
//                getResourceAsStream
//    ("jdbc.properties");

        prop.load(ras);

        String username = prop.getProperty("username");

        String password = prop.getProperty("password");

        System.out.println("username>>"+username);

        System.out.println("password>>"+password);


    }


    @Test
    public void test01() throws Exception{

        Properties prop = new Properties();

        FileInputStream fis = new FileInputStream("D:\\seldom\\rd\\Java_ProjectAll\\Java_ProjectReview\\_01_JavaSE\\src\\main\\resources\\jdbc.properties");

        prop.load(fis);

        String username = prop.getProperty("username");

        String password = prop.getProperty("password");

        System.out.println("username::"+username);

        System.out.println("password::"+password);

    }

}
