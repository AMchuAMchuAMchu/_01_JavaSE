package com.atguigu.SE8.SerializableTest.bean;

import java.io.Serializable;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.SerializableTest01.bean
 * @Version: 1.0
 * @CreateTime: 2022-08-26 12:16:48
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class Anime01 implements Serializable {

    public String animeName;

    public Integer PubTime;

    @Override
    public String toString() {
        return "Anime01{" +
                "animeName='" + animeName + '\'' +
                ", PubTime=" + PubTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Anime01 anime01 = (Anime01) o;

        if (animeName != null ? !animeName.equals(anime01.animeName) : anime01.animeName != null) return false;
        return PubTime != null ? PubTime.equals(anime01.PubTime) : anime01.PubTime == null;
    }

    @Override
    public int hashCode() {
        int result = animeName != null ? animeName.hashCode() : 0;
        result = 31 * result + (PubTime != null ? PubTime.hashCode() : 0);
        return result;
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public Integer getPubTime() {
        return PubTime;
    }

    public void setPubTime(Integer pubTime) {
        PubTime = pubTime;
    }

    public Anime01(String animeName, Integer pubTime) {
        this.animeName = animeName;
        PubTime = pubTime;
    }

    public Anime01() {
    }
}
