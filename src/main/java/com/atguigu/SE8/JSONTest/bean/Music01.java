package com.atguigu.SE8.JSONTest.bean;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.JSONTest.bean
 * @Version: 1.0
 * @CreateTime: 2022-08-26 14:29:32
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class Music01 {

    public String singer;

    public Integer time;

    @Override
    public String toString() {
        return "Music01{" +
                "singer='" + singer + '\'' +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Music01 music01 = (Music01) o;

        if (singer != null ? !singer.equals(music01.singer) : music01.singer != null) return false;
        return time != null ? time.equals(music01.time) : music01.time == null;
    }

    @Override
    public int hashCode() {
        int result = singer != null ? singer.hashCode() : 0;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Music01(String singer, Integer time) {
        this.singer = singer;
        this.time = time;
    }

    public Music01() {
    }
}
