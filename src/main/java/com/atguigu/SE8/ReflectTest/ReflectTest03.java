package com.atguigu.SE8.ReflectTest;

import com.atguigu.SE8.ReflectTest.bean.Anime01;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.ReflectTest
 * @Version: 1.0
 * @CreateTime: 2022-08-30 14:37:30
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class ReflectTest03 {


    @Test
    public void test02(){

        Class<Anime01> anime01Class = Anime01.class;

        Class<? super Anime01> superclass = anime01Class.getSuperclass();

        System.out.println(">"+superclass);

        Type genericSuperclass = anime01Class.getGenericSuperclass();

        System.out.println(">>"+genericSuperclass);

        ParameterizedType pt = (ParameterizedType) genericSuperclass;

        Type[] actualTypeArguments = pt.getActualTypeArguments();

        for (Type actualTypeArgument : actualTypeArguments) {
            System.out.println(">>>"+actualTypeArgument);
        }


    }



    @Test
    public void test01(){

        Class<Anime01> rtc = Anime01.class;

        Constructor<?>[] constructors = rtc.getConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println(">"+constructor);
        }

        Constructor<?>[] declaredConstructors = rtc.getDeclaredConstructors();

        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(">>"+declaredConstructor);
        }




    }

}
