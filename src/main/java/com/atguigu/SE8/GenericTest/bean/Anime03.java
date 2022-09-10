package com.atguigu.SE8.GenericTest.bean;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.GenericTest.bean
 * @Version: 1.0
 * @CreateTime: 2022-09-01 14:37:34
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class Anime03<T> {

    T animeName;

    public T getAnimeName() {
        return this.animeName;
    }

    public void setAnimeName(T animeName) {
        this.animeName = animeName;
    }


}
