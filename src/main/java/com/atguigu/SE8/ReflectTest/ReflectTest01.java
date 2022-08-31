package com.atguigu.SE8.ReflectTest;

import com.atguigu.SE8.ReflectTest.bean.Anime01;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.ReflectTest
 * @Version: 1.0
 * @CreateTime: 2022-08-25 16:07:52
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class ReflectTest01 {



    @Test
    public void test6(){

        Class<Anime01> anime01Class = Anime01.class;

        Field[] declaredFields = anime01Class.getDeclaredFields();

        for (Field declaredField : declaredFields) {

            int modifiers = declaredField.getModifiers();

            System.out.print(Modifier.toString(modifiers)+"\t");

            Class<?> type = declaredField.getType();

            System.out.print(type.getName()+"\t");

            String name = declaredField.getName();

            System.out.print(name+"\t");

            System.out.println();

        }

    }


    @Test
    public void test5(){

        ClassLoader classLoader = ReflectTest01.class.getClassLoader();
        System.out.println("01>>"+classLoader);

        ClassLoader parent01 = classLoader.getParent();

        System.out.println("02>>"+parent01);

        ClassLoader parent02 = parent01.getParent();

        System.out.println("03>>"+parent02);

    }


    @Test
    public void test04() throws Exception {

        Class<Anime01> anime01Class = Anime01.class;

        Anime01 anime01 = new Anime01();

        Class<? extends Anime01> aClass = anime01.getClass();

        Class<?> aClass1 = Class.forName("com.atguigu.SE8.ReflectTest.bean.Anime01");

        Class<?> aClass2 = ClassLoader.getSystemClassLoader().loadClass("com.atguigu.SE8.ReflectTest.bean.Anime01");

        Class<?> aClass3 = ReflectTest01.class.getClassLoader().loadClass("com.atguigu.SE8.ReflectTest.bean.Anime01");



    }

    @Test
    public void test01(){

        //获取对象
        Anime01 anime01 = new Anime01("阿库娅",16);

        new Thread(anime01::character01).start();

        System.out.println("obj >> "+ anime01);

        //获取字段
        String name = anime01.getName();

        System.out.println("obj.name >> "+name);

        //修改字段

        anime01.setName("佐藤和真");

        System.out.println("then obj.name >> "+ anime01.name);

        //获取方法
        anime01.character01();


    }

    @Test
    public void test02() throws Exception {

        Class<Anime01> animeClass = Anime01.class;

        Constructor<Anime01> animeConstructor = animeClass.getConstructor(String.class, int.class);

        Anime01 newInstance = animeConstructor.newInstance("魔女之旅", 2020);

        System.out.println("obj >> "+newInstance);

        Field name = animeClass.getDeclaredField("name");

        name.set(newInstance,"终末的女武神");

        System.out.println("then obj >> "+newInstance);

        Method character02 = animeClass.getDeclaredMethod("character02");

        character02.setAccessible(true);

        character02.invoke(newInstance);

    }

    @Test
    public void test03() throws Exception {

        Class<Anime01> animeClass = Anime01.class;

        Anime01 anime01 = animeClass.newInstance();

        Constructor<?>[] constructors = animeClass.getConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor >> "+ constructor);
        }

        System.out.println("obj >> "+ anime01);

        Field[] declaredFields = animeClass.getDeclaredFields();

        Method[] declaredMethods = animeClass.getDeclaredMethods();

        for (Field declaredField : declaredFields) {
            System.out.println("declaredFields >> "+declaredField.getName());
        }


        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethod >> "+declaredMethod.getName());
        }


    }





}
