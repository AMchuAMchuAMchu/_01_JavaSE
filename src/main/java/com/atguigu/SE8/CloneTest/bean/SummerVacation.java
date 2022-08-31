package com.atguigu.SE8.CloneTest.bean;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.CloneTest.bean
 * @Version: 1.0
 * @CreateTime: 2022-08-26 12:36:20
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class SummerVacation implements Cloneable {

    public String [] animeList = {"魔女之旅","终末的女武神","尸鬼","哥布林杀手","美妙世界","为美好世界献上祝福","黑岩射手","心理测量者"};

    public Integer recordTime = 20220807;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "SummerVacation{" +
                "animeList=" + Arrays.toString(animeList) +
                ", recordTime=" + recordTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SummerVacation that = (SummerVacation) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(animeList, that.animeList)) return false;
        return recordTime != null ? recordTime.equals(that.recordTime) : that.recordTime == null;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(animeList);
        result = 31 * result + (recordTime != null ? recordTime.hashCode() : 0);
        return result;
    }

    public String[] getAnimeList() {
        return animeList;
    }

    public void setAnimeList(String[] animeList) {
        this.animeList = animeList;
    }

    public Integer getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Integer recordTime) {
        this.recordTime = recordTime;
    }

    public SummerVacation(String[] animeList, Integer recordTime) {
        this.animeList = animeList;
        this.recordTime = recordTime;
    }

    public SummerVacation() {
    }
}
