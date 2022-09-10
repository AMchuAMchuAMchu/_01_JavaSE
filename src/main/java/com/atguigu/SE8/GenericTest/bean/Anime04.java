package com.atguigu.SE8.GenericTest.bean;

import java.io.Serializable;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.GenericTest.bean
 * @Version: 1.0
 * @CreateTime: 2022-09-01 14:48:20
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class Anime04 implements Serializable {

    public String animeName;

    public Integer time;

    @Override
    public String toString() {
        return "Anime04{" +
                "animeName='" + animeName + '\'' +
                ", time=" + time +
                '}';
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Anime04(String animeName, Integer time) {
        this.animeName = animeName;
        this.time = time;
    }
}
