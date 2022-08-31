package com.atguigu.SE8.ReflectTest.bean;

import java.util.Arrays;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.ReflectTest.bean
 * @Version: 1.0
 * @CreateTime: 2022-08-25 16:08:19
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class Anime01 {

    public String name;

    private int time;

    protected char [] characters;

    private Anime01(String name, char[] characters) {
        this.name = name;
        this.characters = characters;
    }

    public Anime01(String name, int time, char[] characters) {
        this.name = name;
        this.time = time;
        this.characters = characters;
    }

    @Override
    public String toString() {
        return "Anime01{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", characters=" + Arrays.toString(characters) +
                '}';
    }

    public char[] getCharacters() {
        return characters;
    }

    public void setCharacters(char[] characters) {
        this.characters = characters;
    }

    public void character01(){
        System.out.println("Number one >> 楪祈");
    }

    private void character02(){
        System.out.println("Number one >> 雪之下雪乃,要说她是何等美貌,是令人无法触碰更无法得到的,只能让人为之惊叹其美丽的存在...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    private Anime01(String name) {
        this.name = name;
    }

    public Anime01(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public Anime01() {
    }
}
